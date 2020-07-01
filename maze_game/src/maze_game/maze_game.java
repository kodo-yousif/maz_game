package maze_game ;
 import java.util.Scanner;


public class maze_game { 
	static String maze [] = new String [484]; static int  hey= 0 , place = 2 ; static String hi = "k";
	public static void main(String[] args)    {
		
		maze = working();   // creating bord
		
		System.out.println("welcome to MAZE GAME  \ntry to bring back twi frinds to each other to win \nmove the white smile friend friend to other friend \n\nplease enter (start)  to start the game \nhope to you have fun ");
		String start = " " ;
		Scanner koko = new Scanner (System.in);
		start = koko.nextLine();
		boolean boot = false;
		String base = "start";
		if (start.equals(base)) {
			boot = true;
		}else {
			System.out.println("thanks for opening the projet good bye");
		}
	
		
		
		print(maze);
		while (boot) {
		
		
		hi = koko.next();
		worker();
		print(maze);
		if ( place == 473) { 
			System.err.println("conguratilation you win the game \n hope to see you soon again.");
			boot = false;
		}
		}
		
		koko.close();
	}
//-----------------------------------------------------------------
	public static String[]  working( ) {
		String lu = Character.toString((char)0x2554);
		String ru = Character.toString((char)0x2557);
		String ld = Character.toString((char)0x255A);
		String rd = Character.toString((char)0x255D);
		String upt = Character.toString((char)0x2569);
		String downt = Character.toString((char)0x2566);
		String leftt = Character.toString((char)0x2563);
		String rightt = Character.toString((char)0x2560);
		String piph = Character.toString((char)0x2550);
		String pipv = Character.toString((char)0x2551);
		String middle = Character.toString((char)0x256C);
		String white_smile = Character.toString((char)0x263A);
		String black_smile = Character.toString((char)0x263b);
		
		for ( int x = 0 ; x<maze.length ; x++) {	maze [x]= " ";		}
		for ( int x = 1 , y = 463 ; x<22  ; y++ , x++) {  	maze [x]= " ";	maze[y] = " ";}
		for ( int x = 22 , y = 63 ; x<422  ; y = y+21 , x = x+21) {  maze [x]= pipv;	maze[y] = pipv;}
		for ( int x = 25 , y = 443; x<42 ; y++ , x++) {  maze[x] = piph;   maze[y] = piph;    }
		
		for ( int b = 0 ; b<maze.length ; b++) {
			
			if (b == 24 || b == 68 || b == 276 || b == 405 || b == 328 || b == 246 || b == 161 || b == 376 || b == 117 || b == 22 ) {		maze[b] = lu;		}
			// LU
			
			if ( b == 250 || b == 113 || b == 201 || b == 42 || b == 241) {	maze[b] = ru;	}
			// RU
			
			if (b == 152 || b == 234 || b == 402 || b == 442 || b == 285 || b == 292 || b == 203) {	maze[b] = ld;	}
			//LD
			
			if (b == 80 || b == 159 || b == 124 || b == 418 || b == 288 || b == 374 || b == 462) {	maze[b] = rd;	}
			//RD
			
			if (b == 119 || b == 447 || b == 325 || b == 239 || b == 412 ) {	maze[b] = upt;	}
			//UPT
			
			if (b == 35 || b == 38 || b == 73 ) {	maze[b] = downt;	}
			//DOWNT
			
			if (b == 110 || b == 197 || b == 378 ) {	maze[b] = leftt;	}
			//LEFTT
			
			if (b == 155 || b == 106 || b == 318 ) {	maze[b] = rightt;	}
			//RIGHTT
			
			if (b == 79 || b == 112 || b == 118 || b == 153 || b == 240 || b == 293 || b == 377 || b == 326 || b == 403 || b ==199 || b == 200 || b ==286 || b == 287 || b ==333 || b == 334 || b == 372 || b == 373|| b == 413 || b == 414 || b == 416 || b == 417 ) {	maze[b] = piph;	}
			//PIPH one one and two two
			
			if (b == 45 || b == 66 || b == 397 || b == 271 || b ==103 || b ==82 || b == 353 || b == 311 || b == 290 || b == 59 || b == 267 || b == 182 || b ==98 || b == 77 || b == 56 || b == 391 || b == 370 || b == 349 || b == 264 || b == 243 || b == 222 || b == 138 || b ==304 || b == 283 || b == 426|| b == 262 || b == 115 || b == 94
			|| b == 218	|| b == 176 || b ==134 || b == 131 || b == 89 || b == 381 || b == 360 || b == 339 || b == 297 || b == 213 || b == 192 || b == 171 || b == 150 	) {	maze[b] = pipv;	}
			//PIPV
			
			
			
			

			
			
		}
		maze[332] = middle;
		
		maze [2]  = white_smile;
		maze [473] = black_smile;
		for (int f = 0 ; f<maze.length; f++) {
			if ((f>68 && f<73) ||(f>73 && f<76) || (f> 119 && f< 124) || (f> 161 && f< 167)|| (f> 203 && f< 210)|| (f> 155 && f< 159)|| (f> 193 && f< 197)|| (f> 234 && f<239 )
			|| (f> 246 && f< 250) || (f> 276 && f<282 )|| (f> 318 && f< 325)|| (f> 361 && f< 369 )|| (f> 405 && f< 411 ) || (f> 328 && f< 332 ) || (f> 106 && f< 110)) {
				maze[f] = piph;
			}
		}
		//PIPh	 more than two 
		
		
		
		return maze;
	}
	
//-----------------------------------------------------------------	
	public static void print(String maze []) {
		String white_smile = Character.toString((char)0x263A);
		int k = 0;
		for (int f = 0 ; f<maze.length ; f++) {   if (maze[f].equals(white_smile)) {     maze[f] = " ";}}
		String black = Character.toString((char)0x2665);
		maze[place] = white_smile;
		if (place ==473) {
			maze[463] = black;
		}
		for ( int x = 0 ; x < 24 ; x++) {
				for (int y =1 ; y < 22 ; y++) {
				k = x*21;
				if (k+y == maze.length) { break; }
				System.out.print(maze[k+y]);	}
			System.out.println();		}                      // printing the bord
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
	if (place == 473) {System.err.println("hrey you win the game."); }
		else {System.out.println("movement keys:");
		System.out.println("w ==> going up \t   s ==> going down \ta ==> going left \td ==> going right");}
		
	}
	
//-------------------------------------------------------------------
	public static void worker() {
		
		if (hi.equals("w")) {
			
			if (maze[(place-21)].equals(" ")) {
				place= place -21;
			}else {
				System.err.println("please watch out walls");
			}
			
		}else if (hi.equals("s")) {
			
			if (maze[(place+21)].equals(" ")) {
				place= place + 21;
			}else {
				System.err.println("please watch out walls");
			}
			
		}else if (hi.equals("a")) {
			
			if (maze[(place-1)].equals(" ")) {
				place--;
			}else {
				System.err.println("please watch out walls");
			}
			if ((place -1) == 473 ) {
				place--;
			}
		}else if (hi.equals("d")) {
		
			if (maze[(place+1)].equals(" ")) {
				place++;
				
			}else {
				System.err.println("please watch out walls");
			}
			
		}
		
	}
		
//-------------------------------------------------------------------	
}