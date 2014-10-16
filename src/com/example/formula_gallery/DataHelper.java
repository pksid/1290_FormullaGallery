package com.example.formula_gallery;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class DataHelper extends SQLiteOpenHelper{
	

	public static final String Dbname="P3";
public static final int Version=1;
	public DataHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void onCreate(SQLiteDatabase db) {
	
		db.execSQL("create table PT1 (atomic_number INTEGER PRIMARY KEY,Symbol text,Name text,Atmc_weight text,MP text,BP text,EC text,OS text)");

		db.execSQL("Insert into PT1 values(1,' H',' Hydrogen',' 1.007947','14.01K','20.28K','1s1','1,-1')");
		db.execSQL("Insert into PT1 values(2,' He',' Helium',' 4.002602','0.95K','4.22K','1s2','0')");
		db.execSQL("Insert into PT1 values(3,' Li',' Lithium',' 6.94','453.69K','1615K','[He] 2s1','1')");
		db.execSQL("Insert into PT1 values(4,'Be',' Beryllium',' 9.012182','1560k','2742K','[He] 2s2','2,1')");
		db.execSQL("Insert into PT1 values(5,'B',' Boron',' 10.81','2349K','4200K','[He] 2s2 2p1','3,2,1')");
		db.execSQL("Insert into PT1 values(6,'C',' Carbon',' 12.011','','','[He] 2s2 2p2','4,3,2,1,0,-1,-2,-3,-4')");
		db.execSQL("Insert into PT1 values(7,'N',' Nitrogen',' 14.007','63.15K','77.36K','[He] 2s2 2p3','5,4,3,2,1,-1,-2,-3')");
		db.execSQL("Insert into PT1 values(8,'O',' Oxygen',' 15.999','54.36K','90.20K','[He] 2s2 2p4','2,1,-1,-2')");
		db.execSQL("Insert into PT1 values(9,'F',' Fluorine',' 18.9984032','53.53K','85.03K','[He] 2s2 2p5','-1')");
		db.execSQL("Insert into PT1 values(10,'Ne',' Neon',' 20.1797','24.56K','27.07K','[He] 2s2 2p6','1,0')");
		db.execSQL("Insert into PT1 values(11,'Na',' Sodium',' 22.98976928','370.87K','1156K','[Ne] 3s1','1,-1')");
		db.execSQL("Insert into PT1 values(12,'Mg',' Magnesium',' 24.305','923K','1363K','[Ne] 3s2','2,1')");
		db.execSQL("Insert into PT1 values(13,'Al',' Aluminium',' 26.9815386','933.47K','2792K','[Ne] 3s2 3p1','3,2,1')");
		db.execSQL("Insert into PT1 values(14,'Si',' Silicon',' 28.085','1687K','3538K','[Ne] 3s2 3p2','4,3,2,1,-1,-2,-3,-4')");
		db.execSQL("Insert into PT1 values(15,'P',' Phosphorus',' 30.973762','42.2C','280.5C','[Ne] 3s2 3p3','5,4,3,2,1,-1,-2,-3')");
		db.execSQL("Insert into PT1 values(16,'S',' Sulphur',' 32.066','388.36K','717.8K','[Ne] 3s2 3p4','6,5,4,3,2,1,-1,-2')");
		db.execSQL("Insert into PT1 values(17,'Cl',' Chlorine',' 35.45','171.6K','239.11K','[Ne] 3s2 3p5','7,6,5,4,3,2,1,-1')");
		db.execSQL("Insert into PT1 values(18,'Ar',' Argon',' 39.948','83.80K','87.30K','[Ne]3s2 3p6','0')");
		db.execSQL("Insert into PT1 values(19,'K',' Potassium',' 39.0983','336.53K','1032K','[Ar]4s1','1')");
		db.execSQL("Insert into PT1 values(20,'Ca',' Calcium',' 40.078','1115K','1757K','[Ar]4s2','2,1')");
		db.execSQL("Insert into PT1 values(21,'Sc',' Scandium',' 44.95591','1814K','3109K','[Ar]3d1 4s2','3,2,1')");
		db.execSQL("Insert into PT1 values(22,'Ti',' Titanium',' 47.867','1941K','3560K','[Ar]3d2 4s2','4,3,2,1')");
		db.execSQL("Insert into PT1 values(23,'V',' Vanadium',' 50.9415','2183K','3680K','[Ar]3d3 4s2','5,4,3,2,1,-1')");
		db.execSQL("Insert into PT1 values(24,'Cr',' Chromium',' 51.9961','2180K','2944K','[Ar]3d5 4s1','6,5,4,3,2,1,-1,-2')");
		db.execSQL("Insert into PT1 values(25,'Mn',' Manganese',' 54.938045','1519K','2334K','[Ar]4s2 3d5','7,6,5,4,3,2,1,-1,-2,-3')");
		db.execSQL("Insert into PT1 values(26,'Fe',' Iron',' 55.845','1811K','3134K','[Ar]3d6 4s2','6,5,4,3,2,1,-1,-2')");
		db.execSQL("Insert into PT1 values(27,'Co',' Cobalt',' 58.933195','1768K','3200K','[Ar]4s2 3d7','5,4,3,2,1,-1')");
		db.execSQL("Insert into PT1 values(28,'Ni',' Nickel',' 58.6934','1728K','3186K','[Ar]4s2 3d8','4,3,2,1,-1')");
		db.execSQL("Insert into PT1 values(29,'Cu',' Copper',' 63.546','1357.77K','2835K','[Ar]3d10 4s1','1,2,3,4')");
		db.execSQL("Insert into PT1 values(30,'Zn',' Zinc',' 65.38','692.68K','1180K','[Ar]3d10 4s2','2,1,0')");
		db.execSQL("Insert into PT1 values(31,'Ga',' Gallium',' 69.723','302.9146K','2477K','[Ar]4s2 3d10 4p1','3,2,1')");
		db.execSQL("Insert into PT1 values(32,'Ge',' Germanium',' 72.63','1211.40K','3106K','[Ar]3d10 4s2 4p2','4,3,2,1,0,-1,-2,-3,-4')");
		db.execSQL("Insert into PT1 values(33,'As',' Arsenic',' 74.9216','','','[Ar]4s2 3d10 4p3','5,3,2,1,-3')");
		db.execSQL("Insert into PT1 values(34,'Se',' Selenium',' 78.96','494K','958K','[Ar]3d10 4s2 4p4','6,4,2,1,-2')");
		db.execSQL("Insert into PT1 values(35,'Br',' Bromine',' 79.904','265.8K','332K','[Ar]4s2 3d10 4p5','7,5,4,3,1,-1')");
		db.execSQL("Insert into PT1 values(36,'Kr',' KryPT1on',' 83.798','115.79K','119.93K','[Ar]3d10 4s2 4p6','2,1,0')");
		db.execSQL("Insert into PT1 values(37,'Rb',' Rubidium',' 85.4678','312.46K','961K','[Kr]5s1','1')");
		db.execSQL("Insert into PT1 values(38,'Sr',' Strontium',' 87.62','1050K','1655K','[Kr]5s2','2,1')");
		db.execSQL("Insert into PT1 values(39,'Y',' Yttrium',' 88.90585','1799K','3609K','[Kr]4d1 5s2','3,2,1')");
		db.execSQL("Insert into PT1 values(40,'Zr',' Zirconium',' 91.224','2128K','4682K','[Kr]5s2 4d2','4,3,2,1')");
		db.execSQL("Insert into PT1 values(41,'Nb',' Niobium',' 92.90638','2750K','5017K','[Kr]4d4 5s1','5,4,3,2,-1')");
		db.execSQL("Insert into PT1 values(42,'Mo',' Molybdenum',' 95.96','2896K','4912K','[Kr]5s1 4d5','6,5,4,3,2,1,-1,-2')");
		db.execSQL("Insert into PT1 values(43,'Tc',' Technetium',' 98','2430K','4538K','[Kr]4d5 5s2','7,6,5,4,3,2,1,-1,-3')");
		db.execSQL("Insert into PT1 values(44,'Ru',' Ruthenium',' 101.07','2607K','4423K','[Kr]4d7 5s1','8,7,6,5,4,3,2,1,-2')");
		db.execSQL("Insert into PT1 values(45,'Rh',' Rhodium',' 102.9055','2237K','3968K','[Kr]5s1 4d8','6,5,4,3,2,1,-1')");
		db.execSQL("Insert into PT1 values(46,'Pd',' Palladium',' 106.42','1828.05K','3236K','[Kr]4d10','0,1,2,,4,6')");
		db.execSQL("Insert into PT1 values(47,'Ag',' Silver',' 107.8682','1234.93 K','2435 K','[Kr]4d10 5s1','1,2,3')");
		db.execSQL("Insert into PT1 values(48,'Cd',' Cadmium',' 112.411','594.22K','1040K','[Kr]5s2 4d10','2,1')");
		db.execSQL("Insert into PT1 values(49,'In',' Indium',' 114.818','429.7485 K','2345K','[Kr]4d10 5s2 5p1','3,2,1')");
		db.execSQL("Insert into PT1 values(50,'Sn',' Tin',' 118.71','505.08K','2875K','[Kr]4d10 5s2 5p2','4,3,2,1,-4')");
		db.execSQL("Insert into PT1 values(51,'Sb',' Antimony',' 121.76','903.78K','1860K','[Kr]4d10 5s2 5p3','5,3,-3')");
		db.execSQL("Insert into PT1 values(52,'Te',' Tellurium',' 127.6','722.66K','1261K','[Kr]4d10 5s2 5p4','6,5,4,2,-2')");
		db.execSQL("Insert into PT1 values(53,'I',' Iodine',' 126.90447','386.65K','457.4K','[Kr]4d10 5s2 5p5','7,5,3,1,-1')");
		db.execSQL("Insert into PT1 values(54,'Xe',' Xenon',' 131.293','161.4 K','165.03K','[Kr]5s2 4d10 5p6','0,1,2,4,6,8')");
		db.execSQL("Insert into PT1 values(55,'Cs',' Caesium',' 132.9054519','301.59K','944K','[Xe] 6s1','1')");
		db.execSQL("Insert into PT1 values(56,'Ba',' Barium',' 137.327','1000K','2170K','[Xe]6s2','2')");
		db.execSQL("Insert into PT1 values(57,'La',' Lanthanum',' 138.90547','1193K','3737K','[Xe]5d1 6s2','3,2')");
		db.execSQL("Insert into PT1 values(58,'Ce',' Cerium',' 140.116','1068K','3716K','[Xe]4f1 5d1 6s2','4,3,2,1')");
		db.execSQL("Insert into PT1 values(59,'Pr',' Praseodymium',' 140.90765','1208K','3793K','[Xe]4f3 6s2','4,3,2')");
		db.execSQL("Insert into PT1 values(60,'Nd',' Neodymium',' 144.242','1297K','3347K','[Xe]4f4 6s2','3,2,1')");
		db.execSQL("Insert into PT1 values(61,'Pm',' Promethium',' 145','1315K','3273K','[Xe]6s2 4f5','3')");
		db.execSQL("Insert into PT1 values(62,'Sm',' Samarium',' 150.36','1345K','2067K','[Xe]6s2 4f6','4,3,2,1')");
		db.execSQL("Insert into PT1 values(63,'Eu',' Europium',' 151.964','1099K','1802K','[Xe]4f7 6s2','3,2,1')");
		db.execSQL("Insert into PT1 values(64,'Gd',' Gadolinium',' 157.25','1585K','3546K','[Xe]4f7 5d1 6s2','1,2,3')");
		db.execSQL("Insert into PT1 values(65,'Tb',' Terbium',' 158.92535','1629K','3503K','[Xe]4f9 6s2','4,3,2,1')");
		db.execSQL("Insert into PT1 values(66,'Dy',' Dysprosium',' 162.5','1680K','2840K','[Xe]4f10 6s2','3,2,1')");
		db.execSQL("Insert into PT1 values(67,'Ho',' Holmium',' 164.93032','1734K','2993K','[Xe]4f11 6s2','3,2,1')");
		db.execSQL("Insert into PT1 values(68,'Er',' Erbium',' 167.259','1802K','3141K','[Xe]4f12 6s2','3,2,1')");
		db.execSQL("Insert into PT1 values(69,'Tm',' Thulium',' 168.93421','1818K','2223K','[Xe]4f13 6s2','2,3,4')");
		db.execSQL("Insert into PT1 values(70,'Yb',' Ytterbium',' 173.054','1097K','1469K','[Xe]4f14 6s2','3,2,1')");
		db.execSQL("Insert into PT1 values(71,'Lu',' Lutetium',' 174.9668','1925K','3675K','[Xe]6s2 4f14 5d1','3,2,1')");
		db.execSQL("Insert into PT1 values(72,'Hf',' Hafnium',' 178.49','2506K','4876K','[Xe]4f14 5d2 6s2','4,3,2')");
		db.execSQL("Insert into PT1 values(73,'Ta',' Tantalum',' 180.94788','3290K','5731K','[Xe]4f14 5d3 6s2','5,4,3,2,-1')");
		db.execSQL("Insert into PT1 values(74,'W',' Tungsten',' 183.84','3695K','5828K','[Xe]4f14 5d4 6s2','6,5,4,3,2,1,0,-1,-2')");
		db.execSQL("Insert into PT1 values(75,'Re',' Rhenium',' 186.207','3459K','5869K','[Xe]4f14 5d5 6s2','7,6,5,4,3,2,1,0,-1')");
		db.execSQL("Insert into PT1 values(76,'Os',' Osmium',' 190.23','3306K','5285K','[Xe]4f14 5d6 6s2','8,7,6,5,4,3,2,1,0,-1,-2')");
		db.execSQL("Insert into PT1 values(77,'Ir',' Iridium',' 192.217','2739K','4701K','[Xe]4f14 5d7 6s2','0,1,2,3,4,5,-3,-1')");
		db.execSQL("Insert into PT1 values(78,'PT1',' Platinum',' 195.084','2041.4K','4098K','[Xe]4f14 5d9 6s1','6, 5, 4, 3, 2, 1, -1, -2, -3')");
		db.execSQL("Insert into PT1 values(79,'Au',' Gold',' 196.966569','1337.33K','3129K','[Xe]4f14 5d10 6s1','5, 4, 3, 2, 1, -1, -2')");
		db.execSQL("Insert into PT1 values(80,'Hg',' Mercury',' 200.59','234.3210 K','629.88 K','[Xe]4f14 5d10 6s2','4,2,1')");
		db.execSQL("Insert into PT1 values(81,'Tl',' Thallium',' 204.38','577K','1746K','[Xe]4f14 5d10 6s2 6p1','3,2,1')");
		db.execSQL("Insert into PT1 values(82,'Pb',' Lead',' 207.2','600.61 K','2022K','[Xe]4f14 5d10 6s2 6p2','4,3,2,1')");
		db.execSQL("Insert into PT1 values(83,'Bi',' Bismuth',' 208.9804','544.7 K','1837K','[Xe]4f14 5d10 6s2 6p3','5, 4, 3, 2, 1')");
		db.execSQL("Insert into PT1 values(84,'Po',' Polonium',' 209','527 K','1235K','[Xe]6s2 4f14 5d10 6p4','6, 4, 2, -2')");
		db.execSQL("Insert into PT1 values(85,'At',' Astatine',' 210','575 K','610K','[Xe]4f14 5d10 6s2 6p5','-1, +1, +3, +5, +7')");
		db.execSQL("Insert into PT1 values(86,'Rn',' Radon',' 222','202.0 K','211.3K','[Xe]4f14 5d10 6s2 6p6','6, 2, 0')");
		db.execSQL("Insert into PT1 values(87,'Fr',' Francium',' 223','300 K','950K','[Rn]7s1','1')");
		db.execSQL("Insert into PT1 values(88,'Ra',' Radium',' 226','973 K','2010K','[Rn]7s2','2')");
		db.execSQL("Insert into PT1 values(89,'Ac',' Actinium',' 227','1323K','3471K','[Rn]6d1 7s2','3')");
		db.execSQL("Insert into PT1 values(90,'Th',' Thorium',' 232.03806','2115K','5061K','[Rn]6d2 7s2','4,3,2,1')");
		db.execSQL("Insert into PT1 values(91,'Pa',' Protactinium',' 231.03588','1841K','4300K','[Rn]5f2 6d1 7s2','2,3,4,5')");
		db.execSQL("Insert into PT1 values(92,'U',' Uranium',' 238.02891','1405.3K','4404K','[Rn]5f3 6d1 7s2','6,5,4,3,2,1')");
		db.execSQL("Insert into PT1 values(93,'Np',' NePT1unium',' 237','910K','4273K','[Rn]5f4 6d1 7s2','7,6,5,4,3')");
		db.execSQL("Insert into PT1 values(94,'Pu',' Plutonium',' 244','912.5K','3505K','[Rn]5f6 7s2','8, 7, 6, 5, 4, 3, 2, 1')");
		db.execSQL("Insert into PT1 values(95,'Am',' Americium',' 243','1449K','2880K','[Rn]5f7 7s2','7, 6, 5, 4, 3, 2')");
		db.execSQL("Insert into PT1 values(96,'Cm',' Curium',' 247','1613K','3383K','[Rn]5f7 6d1 7s2','4,3')");
		db.execSQL("Insert into PT1 values(97,'Bk',' Berkelium',' 247','1259K','','[Rn]5f9 7s2','3,4')");
		db.execSQL("Insert into PT1 values(98,'Cf',' Californium',' 251','1173K','1743K','[Rn]5f10 7s2','2,3,4')");
		db.execSQL("Insert into PT1 values(99,'Es',' Einsteinium',' 252','1133K','','[Rn]5f11 7s2','2,3,4')");
		db.execSQL("Insert into PT1 values(100,'Fm',' Fermium',' 257','1800K','','[Rn]5f12 7s2','2,3')");
		db.execSQL("Insert into PT1 values(101,'Md',' Mendelivium',' 258','1100K','','[Rn]5f13 7s2','2,3')");
		db.execSQL("Insert into PT1 values(102,'No',' Nobelium',' 259','1100K','','[Rn]5f14 7s2','2,3')");
		db.execSQL("Insert into PT1 values(103,'Lr',' Lawrencium',' 262','','','[Rn]7s2 5f14 7p1','3')");
		db.execSQL("Insert into PT1 values(104,'Rh',' Rutherfordium',' 267','2400K','5800K','[Rn]5f14 6d2 7s2','4')");
		db.execSQL("Insert into PT1 values(105,'Db',' Dubnium',' 268','','','[Rn]5f14 6d3 7s2','5,4,3')");
		db.execSQL("Insert into PT1 values(106,'Sg',' Seaborgium',' 269','','','[Rn]5f14 6d4 7s2','6, 5, 4, 3')");
		db.execSQL("Insert into PT1 values(107,'Bh',' Bohrium',' 270','','','[Rn]5f14 6d5 7s2','7,5,4,3')");
		db.execSQL("Insert into PT1 values(108,'Hs',' Hassium',' 269','','','[Rn]5f14 6d6 7s2','8, 6, 5, 4, 3, 2')");
		db.execSQL("Insert into PT1 values(109,'Mt',' Meitnerium',' 278','','','[Rn]5f14 6d7 7s2','9, 8, 6, 4, 3, 1')");
		db.execSQL("Insert into PT1 values(110,' Ds',' Darmstadtium',' 281','','','[Rn]5f14 6d8 7s2','8,6,4,2,0')");
		db.execSQL("Insert into PT1 values(111,' Rg',' Roentgenium',' 281','','','[Rn]5f14 6d9 7s2','5, 3, 1, -1')");
		db.execSQL("Insert into PT1 values(112,' Cn',' Copernicium',' 285','','','[Rn]5f14 6d10 7s2','4,2,0')");
		db.execSQL("Insert into PT1 values(113,'Uut',' Ununtrium',' 286','700K','1400K','[Rn]5f14 6d10 7s2 7p1','1,2,3,4,5')");
		db.execSQL("Insert into PT1 values(114,' Fl',' Flerovium',' 289','340K','420K','[Rn]5f14 6d10 7s2 7p2','2,4')");
		db.execSQL("Insert into PT1 values(115,' Uup',' Ununpentium',' 288','700K','1400K','[Rn]5f14 6d10 7s2 7p3','1,3')");
		db.execSQL("Insert into PT1 values(116,' Lv',' Livermorium',' 293','','','[Rn]5f14 6d10 7s2 7p4','2,4')");
		db.execSQL("Insert into PT1 values(117,' Uus',' UnunsePT1ium',' 294','573-773K','873K','[Rn]5f14 6d10 7s2 7p5','-1, +1, +3, +5')");
		db.execSQL("Insert into PT1 values(118,' Uuo',' Ununoctium',' 294','','350K','[Rn]5f14 6d10 7s2 7p6','0,1,2,4,6,-1')");		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
		
		
	}
}
