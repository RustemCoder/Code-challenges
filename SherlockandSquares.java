int squares(int a, int b) {
    int numOfSquares = 0;
    int x = 1;
    while(x*x < a)x++;
    while(x*x <= b){
        numOfSquares++;
        x++;
    }
    
    return numOfSquares;
}
