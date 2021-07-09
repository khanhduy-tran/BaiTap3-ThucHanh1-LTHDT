import java.util.Scanner;

public class MaTran {
	public static int h = 0;
	public static int c = 0;
	public static Scanner scanner;
	public static int a[][] ;
	public static int s = 0;
	public static int sCheoChinh = 0;
	public static int sCheoPhu = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.print("Nhập vào số dòng của ma trận, h =");
		h = scanner.nextInt();
		System.out.print("Nhập vào số cột của ma trân , c =");
		c = scanner.nextInt();
		a = new int [h][c];
		nhapMaTran(h,c);
		xuatmaTran(h,c);
		tongPhanTuMaTran(h,c);
		tongPhanTuDuongCheoChinh(h,c);
		tongPhanTuDuongCheoPhu(h,c);
	}


	private static void tongPhanTuDuongCheoPhu(int m , int n) {
		// TODO Auto-generated method stub
		for(int i = 0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				if(j== n - i - 1)
				sCheoPhu += a[i][j];
			}
		}
		System.out.println("Tổng các phần tử trên đường chéo phụ là : S = " + sCheoPhu);
	}

	private static void tongPhanTuDuongCheoChinh(int m , int n) {
		// TODO Auto-generated method stub
		for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)
				sCheoChinh += a[i][j];
			}
		}
		System.out.println("Tổng các phần tử trên đường chéo chính là : S = " + sCheoChinh);
	}

	private static void tongPhanTuMaTran(int m, int n) {
		// TODO Auto-generated method stub
		for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				s += a[i][j];
			}
		}
		System.out.println("Tổng các phần tử trong ma trận là : S = " + s);
		
	}

	private static void xuatmaTran(int m ,int n) {
		// TODO Auto-generated method stub
		System.out.println("Ma trận vừa nhập là:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(a[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }
	}

	private static void nhapMaTran(int m, int n) {
		// TODO Auto-generated method stub
		System.out.println("Nhập các phần tử cho ma trận B:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print("a[" + i + "," + j + "] = ");
	            a[i][j] = scanner.nextInt();
	        }
	    }
	}
	

}
