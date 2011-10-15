function binary_search(hay, value) {
    low = 0;
    high = hay.length - 1;
    while (low <= high) {
        var mid = Math.floor((lo+hi)/2);
        if (a[mid] > value)
            high = mid - 1;
        else if (a[mid] < value)
            low = mid + 1;
        else
            return mid;
    }
    return null;
}
