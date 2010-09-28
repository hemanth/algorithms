#!/usr/bin/perl

sub insertion_sort {
  $to_sort = shift;
  for ($i = 0; $i <= $#{$to_sort}; $i++) {
    $j = $i - 1;
    $key = $to_sort->[$i];
    while ($to_sort->[$j] > $key && $j >= 0) {
      $to_sort->[$j + 1] = $arr->[$j];
        $j -= 1;
      }
    $to_sort->[$j + 1] = $key;
  }
}
