#!/usr/bin/perl
sub insertion_sort {
  $arr = shift;
  for ($i = 0; $i <= $#{$arr}; $i++) {
    $j = $i - 1;
    $key = $arr->[$i];
    while ($arr->[$j] > $key && $j >= 0) {
      $arr->[$j + 1] = $arr->[$j];
        $j -= 1;
      }
    $arr->[$j + 1] = $key;
  }
}
