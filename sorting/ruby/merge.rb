#!/bin/usr/ruby
# Works with Array 
# ary.mergesort {|a, b| b <=> a}
 
class Array
  def mergesort(&comparitor)
    if length <= 1
      self
    else
      unless comparitor
        comparitor = lambda {|a, b| a <=> b}
      end
      middle = length / 2
      left  = self[0,  middle].mergesort(&comparitor)
      right = self[middle..-1].mergesort(&comparitor)
      merge(left, right, comparitor) 
    end
  end
 
  protected 
  def merge(left, right, comparitor)
    if left.empty?
      right
    elsif right.empty?
      left
    elsif comparitor.call(left.first, right.first) <= 0
      [left.first] + merge(left[1..-1], right, comparitor)
    else
      [right.first] + merge(left, right[1..-1], comparitor)
    end
  end
end
