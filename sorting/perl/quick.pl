#!/usr/bin/perl

sub quicksort {
	@_ <= 1 ? @_ : do {
		my $pivot = pop;
		quicksort( grep {$_ <= $pivot} @_ ), 
		$pivot, 
		quicksort( grep {$_ >  $pivot} @_ )
	}
}
