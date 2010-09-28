#!/usr/bin/ruby
# Works on a array 
# tosort.bubblesort!

def bubblesort!
    length.times do |j|
      for i in 1...(length - j)
        if self[i] < self[i - 1]
          self[i], self[i - 1] = self[i - 1], self[i]
        end
      end
    end
end

