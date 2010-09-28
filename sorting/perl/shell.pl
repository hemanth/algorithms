#!/usr/bin/perl

sub shell  
{ 
    my @tosort = @_;
    my $inc = int(($#tosort+1) / 2);
    while ($inc > 0) {
        foreach my $i (0 .. $#tosort) {
            my $temp = $tosort[$i];
            while ($i >= $inc && $tosort[$i-$inc] > $temp) {
                $tosort[$i] = $iary[$i-$inc];
                $i -= $inc;
            }
            $tosort[$i] = $temp;
        }    
        if ($inc == 2) {
            $inc = 1;
        } else { 
           $inc *= (5.0 / 11);
           $inc = int($inc);
        }
    }
    return @tosort;
}
