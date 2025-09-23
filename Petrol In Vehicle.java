public static int[] petrolInVehicle(int V, int N, int[] P, int[] S ){
      while(N>0){
         for(int i=0; i<V; i++){
            if(S[i] == 1){
               P[i] *= 2;
            }
         }
         N-- ;
      }
      return P;
}

