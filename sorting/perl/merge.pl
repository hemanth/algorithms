#!/usr/bin/perl
sub mergesort
{
        my @i = @_;
        return @i unless scalar @i > 1;
 
        my $m = int $#i / 2;
        my @left = &mergesort(@i[0..$m]);
        my @right = &mergesort(@i[$m+1..$#i]);
 
        return &merge(\@left,\@right);
}
 
sub merge
{
        my($left,$right) = @_;
        my @r = ();
 
        push @r, shift @{(@$left[0] < @$right[0]?$left:$right)} while(@$left and @$right);
        push @r, shift @$left while(@$left);
        push @r, shift @$right while(@$right);
 
        return @r;
}
