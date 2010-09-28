#!/usr/bin/perl
# In line sorting
sub bubble_sort {
    for my $i (0 .. $#_){
        for my $j ($i + 1 .. $#_){
			# swap
            $_[$j] < $_[$i] and @_[$i, $j] = @_[$j, $i];
        }
    }
}
