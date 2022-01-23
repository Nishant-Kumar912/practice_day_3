package com.company;

public class Practice_day_3 {
    //third max number in an array
   /* public static void main(String[] args) {
        int temp,size;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the array elements");
       int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("enter all the elements ");
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for (int i:array){
            System.out.println(i);
        }
        size=array.length;

        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if (array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("third largest no.is:"+array[size-3]);
    }*/
    //printing even and odd nos seperately
   /* public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter all the elements ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("odd nos are:");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
            System.out.println("even nos are:");
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    System.out.println(array[i]);
                }
            }
        }*/
    //multiplication of 2d arrays

  /*  public static void main(String args[]){

        int row1, col1, row2, col2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        row1 = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        col1 = s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        row2 = s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        col2 = s.nextInt();


            int a[][] = new int[row1][col1];
            int b[][] = new int[row2][col2];
            int c[][] = new int[row1][col2];

            System.out.println("Enter values for matrix A : \n");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++)
                    a[i][j] = s.nextInt();
            }
            System.out.println("Enter values for matrix B : \n");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++)
                    b[i][j] = s.nextInt();
            }

            System.out.println("Matrix multiplication is : \n");
            for(int i = 0; i < row1; i++) {
                for(int j = 0; j < col2; j++){
                    c[i][j]=0;
                    for(int k = 0; k < col1; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }*/
    //sum of rows and columns

    /*public static void main(String[] args) {

        int row1, col1, sumrow, sumcol;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows of matrix:");
        row1 = s.nextInt();
        System.out.print("Enter number of columns of  matrix:");
        col1 = s.nextInt();

        int a[][] = new int[row1][col1];
        System.out.println("Enter values for matrix A : \n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++)
                a[i][j] = s.nextInt();
            row1 = a.length;
            col1 = a[0].length;
        }

        for (int i = 0; i < row1; i++) {
            sumrow = 0;
            for (int j = 0; j < col1; j++) {
                sumrow = sumrow + a[i][j];
            }
            System.out.println("sumof" + (i + 1) + "row" + sumrow);
        }
        for (int i = 0; i < col1; i++) {
            sumcol = 0;
            for (int j = 0; j < row1; j++) {
                sumcol = sumcol + a[j][i];

            }
            System.out.println("sumof" + (i + 1) + "col" + sumcol);
        }
    }*/
    //printing array recursively
    /*public static void main(String[] args) {
        printarray obj = new printarray(10);

        for (int i = 0; i < 10; i++) {
            obj.values[i] = i;
        }
        obj.printrecursively(obj.values.length);
    }
}

    class printarray {
        int []values;
        public printarray(int size)
        {
            values=new int[size];
        }

        public void printrecursively(int i){
            if(i==0){
                return;
            }
            else{
                printrecursively(i-1);
                System.out.println("values["+(i-1)+"]"+values[i-1]);
            }

    }*/
    //arithmetic operations using method overloading
    /*int add(int num1, int num2)
    {
        return num1+num2;
    }
    int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    int add(int num1, int num2, int num3, int num4)
    {
        return num1+num2+num3+num4;
    }
    public static void main(String[] args)
    {
        Practice_day_3 obj = new Practice_day_3();
        System.out.println("Sum of two numbers: "+obj.add(10, 20));
        System.out.println("Sum of three numbers: "+obj.add(10, 20, 30));
        System.out.println("Sum of four numbers: "+obj.add(1,  2, 3, 4));
    }*/
    
}




