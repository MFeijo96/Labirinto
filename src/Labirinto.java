
public class Labirinto {
	public static Elemento[][] labirinto = new Elemento[10][10];
	 static {
	Elemento e00 = new Elemento(false, true, true, false);
	Elemento e01 = new Elemento(false, false, true, true);
	Elemento e02 = new Elemento(true, false, true, false);
	Elemento e03 = new Elemento(true, false, true, false);
	Elemento e04 = new Elemento(false, true, true, false);
	Elemento e05 = new Elemento(false, false, true, true);
	Elemento e06 = new Elemento(true, false, true, false);
	Elemento e07 = new Elemento(true, false, true, false);
	Elemento e08 = new Elemento(true, false, true, false);
	Elemento e09 = new Elemento(false, true, true, false);
	
	Elemento e10 = new Elemento(false, true, false, true);
	Elemento e11 = new Elemento(false, true, false, true);
	Elemento e12 = new Elemento(true, false, true, true);
	Elemento e13 = new Elemento(true, true, true, false);
	Elemento e14 = new Elemento(false, true, false, true);
	Elemento e15 = new Elemento(false, true, false, true);
	Elemento e16 = new Elemento(false, false, true, true);
	Elemento e17 = new Elemento(true, false, true, false);
	Elemento e18 = new Elemento(true, false, true, false);
	Elemento e19 = new Elemento(false, true, false, false);
	
	Elemento e20 = new Elemento(false, false, false, true);
	Elemento e21 = new Elemento(true, false, false, false);
	Elemento e22 = new Elemento(true, false, true, false);
	Elemento e23 = new Elemento(false, false, true, false);
	Elemento e24 = new Elemento(true, false, false, false);
	Elemento e25 = new Elemento(false, true, false, false);
	Elemento e26 = new Elemento(false, true, false, true);
	Elemento e27 = new Elemento(false, false, true, true);
	Elemento e28 = new Elemento(true, false, true, false);
	Elemento e29 = new Elemento(true, true, false, false);
	
	Elemento e30 = new Elemento(true, false, false, true);
	Elemento e31 = new Elemento(true, false, true, false);
	Elemento e32 = new Elemento(false, true, true, false);
	Elemento e33 = new Elemento(false, true, false, true);
	Elemento e34 = new Elemento(true, false, true, true);
	Elemento e35 = new Elemento(true, false, false, false);
	Elemento e36 = new Elemento(true, true, false, false);
	Elemento e37 = new Elemento(true, false, false, true);
	Elemento e38 = new Elemento(true, false, true, false);
	Elemento e39 = new Elemento(false, true, true, false);

	Elemento e40 = new Elemento(false, false, true, true);
	Elemento e41 = new Elemento(true, false, true, false);
	Elemento e42 = new Elemento(false, true, false, false);
	Elemento e43 = new Elemento(false, false, false, true);
	Elemento e44 = new Elemento(false, false, true, false);
	Elemento e45 = new Elemento(true, false, true, false);
	Elemento e46 = new Elemento(true, false, true, false);
	Elemento e47 = new Elemento(true, false, true, false);
	Elemento e48 = new Elemento(true, false, true, false);
	Elemento e49 = new Elemento(true, true, false, false);
	
	Elemento e50 = new Elemento(true, false, false, true);
	Elemento e51 = new Elemento(true, true, true, false);
	Elemento e52 = new Elemento(true, false, false, true);
	Elemento e53 = new Elemento(false, true, false, false);
	Elemento e54 = new Elemento(true, false, false, true);
	Elemento e55 = new Elemento(true, false, true, false);
	Elemento e56 = new Elemento(true, false, true, false);
	Elemento e57 = new Elemento(true, false, true, false);
	Elemento e58 = new Elemento(false, true, true, false);
	Elemento e59 = new Elemento(false, true, true, true);
	
	Elemento e60 = new Elemento(false, false, true, true);
	Elemento e61 = new Elemento(true, false, true, false);
	Elemento e62 = new Elemento(true, false, true, false);
	Elemento e63 = new Elemento(true, true, false, false);
	Elemento e64 = new Elemento(true, false, true, true);
	Elemento e65 = new Elemento(false, false, true, false);
	Elemento e66 = new Elemento(true, false, true, false);
	Elemento e67 = new Elemento(false, true, true, false);
	Elemento e68 = new Elemento(true, true, false, true);
	Elemento e69 = new Elemento(false, true, false, true);

	Elemento e70 = new Elemento(false, false, false, true);
	Elemento e71 = new Elemento(true, false, true, false);
	Elemento e72 = new Elemento(true, false, true, false);
	Elemento e73 = new Elemento(true, false, true, false);
	Elemento e74 = new Elemento(true, false, true, false);
	Elemento e75 = new Elemento(false, true, false, false);
	Elemento e76 = new Elemento(false, true, true, true);
	Elemento e77 = new Elemento(false, false, false, true);
	Elemento e78 = new Elemento(true, false, true, false);
	Elemento e79 = new Elemento(true, true, false, false);
	
	Elemento e80 = new Elemento(false, true, false, true);
	Elemento e81 = new Elemento(true, false, true, true);
	Elemento e82 = new Elemento(true, false, true, false);
	Elemento e83 = new Elemento(true, false, true, false);
	Elemento e84 = new Elemento(false, true, true, false);
	Elemento e85 = new Elemento(false, true, false, true);
	Elemento e86 = new Elemento(true, false, false, true);
	Elemento e87 = new Elemento(true, true, false, false);
	Elemento e88 = new Elemento(false, false, true, true);
	Elemento e89 = new Elemento(false, true, true, false);
	
	Elemento e90 = new Elemento(true, false, false, true);
	Elemento e91 = new Elemento(true, false, true, false);
	Elemento e92 = new Elemento(true, false, true, false);
	Elemento e93 = new Elemento(true, false, true, false);
	Elemento e94 = new Elemento(true, true, false, false);
	Elemento e95 = new Elemento(true, false, false, true);
	Elemento e96 = new Elemento(true, false, true, false);
	Elemento e97 = new Elemento(true, false, true, false);
	Elemento e98 = new Elemento(true, true, false, false);
	Elemento e99 = new Elemento(true, false, false, true);
	
	labirinto = new Elemento[][] {
		{e00,e01,e02,e03,e04,e05,e06,e07,e08,e09},
		{e10,e11,e12,e13,e14,e15,e16,e17,e18,e19},
		{e20,e21,e22,e23,e24,e25,e26,e27,e28,e29},
		{e30,e31,e32,e33,e34,e35,e36,e37,e38,e39},
		{e40,e41,e42,e43,e44,e45,e46,e47,e48,e49},
		{e50,e51,e52,e53,e54,e55,e56,e57,e58,e59},
		{e60,e61,e62,e63,e64,e65,e66,e67,e68,e69},
		{e70,e71,e72,e73,e74,e75,e76,e77,e78,e79},
		{e80,e81,e82,e83,e84,e85,e86,e87,e88,e89},
		{e90,e91,e92,e93,e94,e95,e96,e97,e98,e99}};
	 } 
}
