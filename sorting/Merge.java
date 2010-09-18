public static void mergesort(int[ ] set, int first, int n)
{

 int n1; // Size of the first half of the array

 int n2; // Size of the second half of the array



 if (n > 1)

 {

    // Compute sizes of the two halves

    n1 = n / 2;

    n2 = n - n1;



    mergesort(set, first, n1); // Sort set[first] through set[first+n1-1]

    mergesort(set, first + n1, n2); // Sort set[first+n1] to the end



    // Merge the two sorted halves.

    merge(set, first, n1, n2);

 }

   } 

  

private static void merge(int[ ] set, int first, int n1, int n2)
{

	int[ ] temp = new int[n1+n2]; 

	int toTemp  = 0; 

	int firstHalf = 0; 

	int secondHalf = 0; 

	int i;


 // Merge elements
 while ((firstHalf < n1) && (secondHalf < n2))
 {

    if (set[first + firstHalf] < set[first + n1 + secondHalf])

  temp[toTemp++] = set[first + (firstHalf++)];

    else

  temp[toTemp++] = set[first + n1 + (secondHalf++)];

 }



 // cp (left,right) subarrays.

 while (firstHalf < n1)

    temp[toTemp++] = set[first + (firstHalf++)];

 while (secondHalf < n2)

    temp[toTemp++] = set[first + n1 + (secondHalf++)];



 // temp back to the set array.

 for (i = 0; i < n1+n2; i++)

    set[first + i] = temp[i];

   }

   

}


