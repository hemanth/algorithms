#!/usr.bin/ruby

class Array
  def selectionsort!
    0.upto(length - 2) do |i|
      (mindx = i + 1).upto(length - 1) do |j|
        if self[j] < self[mindx]
          mindx = j
        end
      end
      if self[i] > self[mindx]
        self[i], self[mindx] = self[mindx], self[i]
      end
    end
    self
  end
end
