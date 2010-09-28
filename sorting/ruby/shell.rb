#!/usr/bin/bash

class Array
  def shellsort!
    inc = length / 2
    while inc != 0
      each_with_index do |el, i|
        while i >= inc and self[i - inc] > el
          self[i] = self[i - inc]
          i -= inc
        end
        self[i] = el
      end
      inc = (inc == 2 ? 1 : (inc * 5.0 / 11).to_i)
    end
  end
end
