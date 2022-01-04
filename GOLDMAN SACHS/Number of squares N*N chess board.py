def countSquares(n):
     
    
    return ((n * (n + 1) / 2)
           * (2 * n + 1) / 3)

n=int(input("Enter the type of chessboard: "))

     
print("Count of squares is ",int(countSquares(n)))
