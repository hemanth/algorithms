#!/bin/usr/ruby
# Works on an Array 

def heapsort!
    # Inline heapify
    ((length - 2) / 2).downto(0) {|start| siftdown(start, length - 1)}
 
    (length - 1).downto(1) do |tillend|
      self[end_], self[0] = self[0], self[end_]
      siftdown(0, end_ - 1)
    end
    self
  end
 
def siftdown(start, tillend)
    root = start
    loop do
      child = root * 2 + 1
      break if child > tillend
      if child + 1 <= tillend and self[child] < self[child + 1]
        child += 1
      end
      if self[root] < self[child]
        self[root], self[child] = self[child], self[root]
        root = child
      else
        break
      end
    end
end
