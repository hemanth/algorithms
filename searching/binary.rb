#!/bin/ruby
class Array
  def binary_search(val, low=0, high=(length - 1))
    return nil if high < low
    mid = (low + high) / 2
    case
      when self[mid] > val then binary_search(val, low, mid-1)
      when self[mid] < val then binary_search(val, mid+1, high)
      else mid
    end
  end
end
