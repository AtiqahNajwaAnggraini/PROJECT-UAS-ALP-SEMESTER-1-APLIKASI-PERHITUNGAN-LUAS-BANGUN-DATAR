/*
*
*	NAMA			: ATIQAH NAJWA ANGGRAINI
*	NIM				: 202013024
*	KELAS			: TIF 1B
*	MATA KULIAH		: PRAKTIK ALGORITMA 
* 	DOSEN PENGAMPU	: SLAMET TRIYANTO S. ST.
*
*/

import java.util.*;
public class tugas_Uas_Perhitungan_Luas_Bangun_Datar{
	public static void main (String[]args){

// Tampilan Awal

		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = =");
		System.out.println("-------PROGRAM PERHITUNGAN LUAS BANGUN DATAR-------");
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = =");
		login_pogram();

	}
// Masukkan Username dan Password

		static void login_pogram(){
		String data[]={"atiqah","202013024"};
		String username,password;
		Scanner masuk=new Scanner(System.in);
		System.out.print("\nUsername\t: ");
		username=masuk.nextLine();
		System.out.print("\nPassword\t: ");
		password=masuk.nextLine();
		/**
		 * Percabangan untuk mengecek keberadaan data yang sudah kita inputkan di atas
		 */
		

		if(username.equals(data[0])&&password.equals(data[1])){
			
			System.out.println();
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = =");
			System.out.println("-------------------Selamat Datang------------------");
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = =");
			System.out.println();
			menu_utama();
		}else{
			System.out.println();
			System.out.println("Maaf Username dan Password tidak tersedia");
			System.out.println("Silahkan Masukkan Username dan Password Kembali");
			login_pogram();
		}
		
		
	}

// Pemilihan di menu awal

	static void menu_utama(){
			int menu;
			Scanner terima=new Scanner(System.in);
			System.out.println("");
			System.out.println("");
			System.out.println("         ===================================");
			System.out.println("         |              M E N U            |");
			System.out.println("         ===================================");
			System.out.println("         | 1. Menghitung Luas Bangun Datar |");
			System.out.println("         | 2. Keluar                       |");
			System.out.println("         -----------------------------------");
		
		System.out.print("Silahkan Masukan Pilihan Menu\t: ");
			menu=terima.nextInt();
			System.out.println();
			System.out.println();
			System.out.println();

		if(menu==1){
			perhitungan();
		}else if(menu==2){
			keluar();
		}else{
			System.out.println("Maaf Pilihan tidak tersedia");
			System.out.print("Silahkan Pilih Menu Sesuai yang Ditetapkan\t: ");
			menu_utama();
		}
	}

// Pemilihan bangun datar yang ingin dihitung
	static void perhitungan(){
		int daftar;
		Scanner terima=new Scanner(System.in);
		System.out.println("         ---------------------------------");
		System.out.println("         |          BANGUN DATAR         |");
		System.out.println("         ---------------------------------");
		System.out.println("         | 1.  Persegi                   |");
		System.out.println("         | 2.  Persegi Panjang           |");
		System.out.println("         | 3.  Segitiga                  |");
		System.out.println("         | 4.  Lingkaran                 |");
		System.out.println("         | 5.  Jajar Genjang             |");
		System.out.println("         | 6.  Belah Ketupat             |");
		System.out.println("         | 7.  Trapesium                 |");
		System.out.println("         | 8.  Layang-Layang             |");
		System.out.println("         ---------------------------------");
		System.out.println("         | 9.  Menu Sebelumnya           |");
		System.out.println("         ---------------------------------");
		System.out.print("Silahkan Pilih Bangun Datar\t: ");
		daftar=terima.nextInt();
		if(daftar==9){
			menu_utama();
		}if(daftar<9){
			int banyak;
			System.out.print("Silahkan Masukan Banyak Bangun yang Dihitung\t: ");
			banyak=terima.nextInt();
			double luas[]=new double[banyak];
			double jari[]=new double[banyak];
			double tinggi[]=new double[banyak];
			double alas[]=new double[banyak];
			double diagonal1[]=new double[banyak];
			double diagonal2[]=new double[banyak];
			double sisi[]=new double[banyak];
			double sisiAtas[]=new double[banyak];
			double sisiBawah[]=new double[banyak];
			double panjang[]=new double[banyak];
			double lebar[]=new double[banyak];
			double pi=3.14;
			int i;
					
			switch(daftar){
				case 1:
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("      PROGRAM MENGHITUNG LUAS PERSEGI ");
						System.out.println("******************************************");
						System.out.println();
						for(i=0;i<banyak;i++){

						System.out.println("Persegi "+(i+1));
						System.out.println("------------------------------------------");
						System.out.print("Silahkan Masukkan Sisi = ");
						sisi[i]=terima.nextDouble();

						luas[i]=sisi[i]*sisi[i];

						System.out.println("");
						System.out.println("******************************************");
						System.out.println("LUAS PERSEGI "+(i+1)+" = "+luas[i]);
						System.out.println("******************************************");
						System.out.println();
						}

						double penampung;
						for (i=0;i<luas.length;i++){
							for(int k=0;k<(luas.length-1);k++){
								if(luas[k]>luas[k+1]){
									penampung=luas[k];
									luas[k]=luas[k+1];
									luas[k+1]=penampung;
									}
								}
							}
							System.out.println("Luas Persegi Diurutkan Dari yang Terkecil  : ");
							for(i=0;i<luas.length;i++){
								System.out.println((i+1)+". "+luas[i]);
							}
							lanjut();

				break;
				case 2:
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("  PROGRAM MENGHITUNG LUAS PERSEGI PANJANG ");
						System.out.println("******************************************");
						System.out.println();
						for(i=0;i<banyak;i++){

						System.out.println("Persegi Panjang "+(i+1));
						System.out.println("------------------------------------------");
						System.out.print("Silahkan Masukkan Panjang = ");
						panjang[i]=terima.nextDouble();
				
						System.out.print("Silahkan Masukkan Lebar = ");
						lebar[i]=terima.nextDouble();
				
						luas[i]=panjang[i]*lebar[i];
				
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("LUAS PERSEGI PANJANG "+(i+1)+" = "+luas[i]);
						System.out.println("******************************************");
						System.out.println();
						}
						for (i=0;i<luas.length;i++){
							for(int k=0;k<(luas.length-1);k++){
								if(luas[k]>luas[k+1]){
									penampung=luas[k];
									luas[k]=luas[k+1];
									luas[k+1]=penampung;
									}
								}
							}
							System.out.println("Luas Persegi Panjang Diurutkan Dari yang Terkecil  : ");
							for(i=0;i<luas.length;i++){
								System.out.println((i+1)+". "+luas[i]);
							}
							lanjut();
				break;
				case 3:
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("     PROGRAM MENGHITUNG LUAS SEGITIGA ");
						System.out.println("******************************************");
						System.out.println();
						for(i=0;i<banyak;i++){

						System.out.println("Segitiga "+(i+1));
						System.out.println("------------------------------------------");
						System.out.print("Silahkan Masukkan Alas = ");
						alas[i]=terima.nextDouble();
				
						System.out.print("Silahkan Masukkan Tinggi = ");
						tinggi[i]=terima.nextDouble();
				
						luas[i]=(alas[i]*tinggi[i])/2;
				
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("LUAS SEGITIGA = "+(i+1)+" = "+luas[i]);
						System.out.println("******************************************");
						System.out.println();
						}
						for (i=0;i<luas.length;i++){
							for(int k=0;k<(luas.length-1);k++){
								if(luas[k]>luas[k+1]){
									penampung=luas[k];
									luas[k]=luas[k+1];
									luas[k+1]=penampung;
									}
								}
							}
							System.out.println("Luas Segitiga Diurutkan Dari yang Terkecil  : ");
							for(i=0;i<luas.length;i++){
								System.out.println((i+1)+". "+luas[i]);
							}
							lanjut();
				break;
				case 4:
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("     PROGRAM MENGHITUNG LUAS LINGKARAN ");
						System.out.println("******************************************");
						System.out.println();
						for(i=0;i<banyak;i++){

						System.out.println("Lingkaran "+(i+1));
						System.out.println("------------------------------------------");
						System.out.print("Silahkan Masukkan Jari-Jari = ");
						jari[i]=terima.nextDouble();
				
						luas[i]=pi*jari[i]*jari[i];
				
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("LUAS LINGKARAN "+(i+1)+" = "+luas[i]);
						System.out.println("******************************************");
						System.out.println();
						}
						for (i=0;i<luas.length;i++){
							for(int k=0;k<(luas.length-1);k++){
								if(luas[k]>luas[k+1]){
									penampung=luas[k];
									luas[k]=luas[k+1];
									luas[k+1]=penampung;
									}
								}
							}
							System.out.println("Luas Lingkaran Diurutkan Dari yang Terkecil  : ");
							for(i=0;i<luas.length;i++){
								System.out.println((i+1)+". "+luas[i]);
							}
							lanjut();
				break;
				case 5:
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("   PROGRAM MENGHITUNG LUAS JAJAR GENJANG ");
						System.out.println("******************************************");
						System.out.println();
						for(i=0;i<banyak;i++){

						System.out.println("Jajar Genjang "+(i+1));
						System.out.println("------------------------------------------");
						System.out.print("Silahkan Masukkan Alas = ");
						alas[i]=terima.nextDouble();
				
						System.out.print("Silahkan Masukkan Tinggi = ");
						tinggi[i]=terima.nextDouble();
				
						luas[i]=(alas[i]*tinggi[i])/2;
				
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("LUAS JAJAR GENJANG = "+(i+1)+" = "+luas[i]);
						System.out.println("******************************************");
						System.out.println();
						}
						for (i=0;i<luas.length;i++){
							for(int k=0;k<(luas.length-1);k++){
								if(luas[k]>luas[k+1]){
									penampung=luas[k];
									luas[k]=luas[k+1];
									luas[k+1]=penampung;
									}
								}
							}
							System.out.println("Luas Jajar Genjang Diurutkan Dari yang Terkecil  : ");
							for(i=0;i<luas.length;i++){
								System.out.println((i+1)+". "+luas[i]);
							}
							lanjut();
				break;
				case 6:
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("   PROGRAM MENGHITUNG LUAS BELAH KETUPAT ");
						System.out.println("******************************************");
						System.out.println();
						for(i=0;i<banyak;i++){

						System.out.println("Belah Ketupat "+(i+1));
						System.out.println("------------------------------------------");
						System.out.print("Silahkan Masukkan Diagonal 1 = ");
						diagonal1[i]=terima.nextDouble();
				
						System.out.print("Silahkan Masukkan Diagonal 2 = ");
						diagonal2[i]=terima.nextDouble();
				
						luas[i]=(diagonal1[i]*diagonal2[i])/2;
				
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("LUAS BELAH KETUPAT = "+(i+1)+" = "+luas[i]);
						System.out.println("******************************************");
						System.out.println();
						}
						for (i=0;i<luas.length;i++){
							for(int k=0;k<(luas.length-1);k++){
								if(luas[k]>luas[k+1]){
									penampung=luas[k];
									luas[k]=luas[k+1];
									luas[k+1]=penampung;
									}
								}
							}
							System.out.println("Luas Belah Ketupat Diurutkan Dari yang Terkecil  : ");
							for(i=0;i<luas.length;i++){
								System.out.println((i+1)+". "+luas[i]);
							}
							lanjut();
				break;
				case 7:
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("     PROGRAM MENGHITUNG LUAS TRAPESIUM");
						System.out.println("******************************************");
						System.out.println();
						for(i=0;i<banyak;i++){
						System.out.println("Trapesium "+(i+1));
						System.out.println("------------------------------------------");
						System.out.print("Silahkan Masukkan Sisi Atas = ");
						sisiAtas[i]=terima.nextDouble();
						System.out.print("Silahkan Masukkan Sisi Bawah = ");
						sisiBawah[i]=terima.nextDouble();
						System.out.print("Silahkan Masukkan Tinggi = ");
						tinggi[i]=terima.nextDouble();

						luas[i]=((sisiAtas[i]+sisiBawah[i])*tinggi[i])/2;
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("LUAS TRAPESIUM = "+(i+1)+" = "+luas[i]);
						System.out.println("******************************************");
						System.out.println();
						}
						for (i=0;i<luas.length;i++){
							for(int k=0;k<(luas.length-1);k++){
								if(luas[k]>luas[k+1]){
									penampung=luas[k];
									luas[k]=luas[k+1];
									luas[k+1]=penampung;
									}
								}
							}
							System.out.println("Luas Trapesium Diurutkan Dari yang Terkecil  : ");
							for(i=0;i<luas.length;i++){
								System.out.println((i+1)+". "+luas[i]);
							}
							lanjut();
				break;
				case 8:
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("   PROGRAM MENGHITUNG LUAS LAYANG-LAYANG ");
						System.out.println("******************************************");
						System.out.println();
						for(i=0;i<banyak;i++){

						System.out.println("Layang-Layang "+(i+1));
						System.out.println("------------------------------------------");
						System.out.print("Silahkan Masukkan Diagonal 1 = ");
						diagonal1[i]=terima.nextDouble();
				
						System.out.print("Silahkan Masukkan Diagonal 2 = ");
						diagonal2[i]=terima.nextDouble();
				
						luas[i]=(diagonal1[i]*diagonal2[i])/2;
				
						System.out.println("");
						System.out.println("******************************************");
						System.out.println("LUAS LAYANG-LAYANG = "+(i+1)+" = "+luas[i]);
						System.out.println("******************************************");
						System.out.println();
						}
						for (i=0;i<luas.length;i++){
							for(int k=0;k<(luas.length-1);k++){
								if(luas[k]>luas[k+1]){
									penampung=luas[k];
									luas[k]=luas[k+1];
									luas[k+1]=penampung;
									}
								}
							}
							System.out.println("Luas Layang-Layang Diurutkan Dari yang Terkecil  : ");
							for(i=0;i<luas.length;i++){
								System.out.println((i+1)+". "+luas[i]);
							}
							lanjut();
				break;
				default : 
					System.out.println("Pilihan yang anda masukkan tidak tersedia");
					System.out.println("Silahkan pilih bangun datar yang tertera");
					System.out.println();
					perhitungan();
				break;
					}
				}
			}

	static void lanjut(){
		Scanner terima=new Scanner(System.in);
		int ulang;
		System.out.println();	
		System.out.println("-------------------------------------------");
		System.out.println("|~~~~~~~~Perhitungan Telah Selesai~~~~~~~~|");
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println("Silahkan Masukkan Pilihan Untuk Melanjutkan");
		System.out.println("     Tekan 1 untuk Menu Sebelumnya");
		System.out.println("     Tekan 2 untuk kembali ke Menu");
		System.out.println("     Tekan 3 untuk Keluar");
		System.out.print("Masukan Pilihan : ");
		ulang=terima.nextInt();
		if(ulang==1){
			perhitungan();
		}if(ulang==2){
			menu_utama();
		}if(ulang==3){
		keluar();
		}
		else{
			System.out.println("Pilihan yang anda masukkan tidak tersedia");
			lanjut();
		}
	}

	static void keluar(){
		System.out.println("------------------------------------------");
		System.out.println("|                   ~                    |");
		System.out.println("|               System Keluar            |");
		System.out.println("|     Terima Kasih Sudah Berkunjung      |");
		System.out.println("|                   ~                    |");
		System.out.println("------------------------------------------");
		System.exit(0);
	}
}