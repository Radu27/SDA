package com.company;

public class Main {

    // Metoda 1
    // Functia de multiplicare a matricilor
    public int[][] multiply(int[][] A, int[][] B)
    {
        int n = A.length;
        // Crearea unei matrici patrate cu dimensiunea n
        // n este introdus de utilizator
        int[][] R = new int[n][n];

        // In cazul in care exista un singur element
        if (n == 1)

            // Returnarea multiplicarii simple a doua elemente in matrice
            R[0][0] = A[0][0] * B[0][0];
        else {
            // Pasul 1: Impartirea matricei in parti
            int[][] A11 = new int[n / 2][n / 2];
            int[][] A12 = new int[n / 2][n / 2];
            int[][] A21 = new int[n / 2][n / 2];
            int[][] A22 = new int[n / 2][n / 2];
            int[][] B11 = new int[n / 2][n / 2];
            int[][] B12 = new int[n / 2][n / 2];
            int[][] B21 = new int[n / 2][n / 2];
            int[][] B22 = new int[n / 2][n / 2];

            // Pasul 2: Impartirea matricei A in 4 jumatati
            split(A, A11, 0, 0);
            split(A, A12, 0, n / 2);
            split(A, A21, n / 2, 0);
            split(A, A22, n / 2, n / 2);

            // Pasul 2: Impartirea matricei B in 4 jumatati
            split(B, B11, 0, 0);
            split(B, B12, 0, n / 2);
            split(B, B21, n / 2, 0);
            split(B, B22, n / 2, n / 2);

            // Folosim formulele descrise anterior (Strassen)
            // M1:=(A1+A3)×(B1+B2)
            int[][] M1 = multiply(add(A11, A22), add(B11, B22));

            // M2:=(A2+A4)×(B3+B4)
            int[][] M2 = multiply(add(A21, A22), B11);

            // M3:=(A1−A4)×(B1+A4)
            int[][] M3 = multiply(A11, sub(B12, B22));

            // M4:=A1×(B2−B4)
            int[][] M4 = multiply(A22, sub(B21, B11));

            // M5:=(A3+A4)×(B1)
            int[][] M5 = multiply(add(A11, A12), B22);

            // M6:=(A1+A2)×(B4)
            int[][] M6 = multiply(sub(A21, A11), add(B11, B12));

            // M7:=A4×(B3−B1)
            int[][] M7 = multiply(sub(A12, A22), add(B21, B22));

            // P:=M2+M3−M6−M7
            int[][] C11 = add(sub(add(M1, M4), M5), M7);

            // Q:=M4+M6
            int[][] C12 = add(M3, M5);

            // R:=M5+M7
            int[][] C21 = add(M2, M4);

            // S:=M1−M3−M4−M5
            int[][] C22 = add(sub(add(M1, M3), M2), M6);

            // Pasul 3: Alaturarea celor 4 jumatati intr-o matrice
            join(C11, R, 0, 0);
            join(C12, R, 0, n / 2);
            join(C21, R, n / 2, 0);
            join(C22, R, n / 2, n / 2);
        }

        // Pasul 4: Returneaza rezultatul
        return R;
    }

    // Functia de scadere a doua matrici
    public int[][] sub(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                // Scaderea elementelor corespunzatoare din matrici
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    // Functia de adaugare
    public int[][] add(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j]; //Adaugare elemente
        return C;
    }

    // Functia de a imparti matricea parinte in matrici copil
    public void split(int[][] P, int[][] C, int iB, int jB)
    {
        for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                C[i1][j1] = P[i2][j2];
    }

    // Functia de a alatura matricele copil in matrice parinte
    public void join(int[][] C, int[][] P, int iB, int jB)

    {
        for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                P[i2][j2] = C[i1][j1];
    }

    public static void main(String[] args)
    {
        System.out.println("Algoritmul lui Strassen de multiplicare a matricilor\n");
        // Obiect al clasei Strassen
        Main s = new Main();

        // Dimensiunea matricei
        int N = 4;

        int[][] A = { { 1, 2, 3, 4 },
                { 4, 3, 0, 1 },
                { 5, 6, 1, 1 },
                { 0, 2, 5, 6 } };

        int[][] B = { { 1, 0, 5, 1 },
                { 1, 2, 0, 2 },
                { 0, 3, 2, 3 },
                { 1, 2, 1, 2 } };

        int[][] C = s.multiply(A, B);

        System.out.println("Produsul matricilor A si B este: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}