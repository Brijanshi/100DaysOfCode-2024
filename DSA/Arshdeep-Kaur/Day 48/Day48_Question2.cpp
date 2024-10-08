int kthSmallest(int mat[MAX][MAX], int n, int k) {
  int low = mat[0][0];
  int high = mat[n-1][n-1];
  
  while(low < high) {
      int mid = low + (high-low)/2;
      int count = 0;
      for(int i=0; i<n; i++) {
          count += upper_bound(mat[i], mat[i] + n, mid) - mat[i];
      }
      
      if (count < k) {
          low = mid+1;
      } else {
          high = mid;
      }
  }
  
  return low;
}
