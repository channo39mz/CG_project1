import java.awt.*;

public class mydraw {
    static void heard(Graphics g){
        Color c = new Color(244,179,184);
        g.setColor(c);
        DrawALGO.my_Bezier_Curve(g, 359, 194, 379, 179, 382, 211, 348, 216);
        DrawALGO.my_Bezier_Curve(g, 359, 194, 357, 169, 332, 192, 348, 216);
        DrawALGO.my_Bezier_Curve(g, 321, 202, 314, 195, 313, 211, 324, 211);
        DrawALGO.my_Bezier_Curve(g, 321, 202, 324, 192, 333, 200, 324, 211);
        DrawALGO.my_Bezier_Curve(g, 50, 179, 55, 150, 85, 175, 59, 208);
        DrawALGO.my_Bezier_Curve(g, 50, 179, 27, 160, 23, 204, 59, 208);
        DrawALGO.my_Bezier_Curve(g, 30, 243, 35, 222, 56, 239, 36, 264);
        DrawALGO.my_Bezier_Curve(g, 30, 243, 15, 230, 10, 262, 36, 264);
        DrawALGO.my_Bezier_Curve(g, 53, 275, 55, 266, 65, 274, 56, 285);
        DrawALGO.my_Bezier_Curve(g, 53, 275, 44, 270, 44, 284, 56, 285);
    }

    static void lefteye(Graphics g){
        DrawALGO.bresenhamLine(g, 142, 249, 141, 239);
        DrawALGO.drawQuadraticBezierCurve(g, 141, 239, 132, 231, 131, 231);
        DrawALGO.drawQuadraticBezierCurve(g, 131, 231, 118, 234, 114, 248);
        DrawALGO.drawQuadraticBezierCurve(g, 114, 248, 110, 248, 112, 275);
        DrawALGO.drawQuadraticBezierCurve(g, 112, 275, 113, 281, 122, 285);
        DrawALGO.bresenhamLine(g, 122, 285, 138, 286);
        DrawALGO.bresenhamLine(g, 138, 286, 142, 283);

        DrawALGO.drawQuadraticBezierCurve(g, 134, 241, 128, 241, 129, 266);
        DrawALGO.drawQuadraticBezierCurve(g, 129, 266, 128, 281, 140, 283);
        DrawALGO.drawQuadraticBezierCurve(g, 140, 283, 148, 281, 145, 264);
        DrawALGO.drawQuadraticBezierCurve(g, 145, 264, 148, 241, 134, 241);
       
        Color c = new Color(136,150,140);
        g.setColor(c);
        DrawALGO.drawQuadraticBezierCurve(g, 131, 273, 133, 265, 138, 266);
        DrawALGO.drawQuadraticBezierCurve(g, 142, 265, 144, 264, 145, 268);//line in eye
        c = new Color(177,210,158);
        g.setColor(c);
        DrawALGO.drawQuadraticBezierCurve(g, 135, 280, 135, 264, 145, 273);
        g.setColor(Color.BLACK);

        int[] arrx = {138, 141, 142, 141, 139, 137, 136};
        int[] arry = {256, 259, 263, 266, 267, 265, 259};
        //g.setColor(Color.GREEN);
        DrawALGO.mydrawpoly(g,arrx,arry);

    }

    static void righteye(Graphics g){
        DrawALGO.drawQuadraticBezierCurve(g, 216, 229, 207, 229, 207, 255);
        DrawALGO.drawQuadraticBezierCurve(g, 207, 255, 207, 271, 223, 276);
        DrawALGO.drawQuadraticBezierCurve(g, 223, 276, 237, 271, 234, 252);
        DrawALGO.drawQuadraticBezierCurve(g, 234, 252, 227, 229, 216, 229);

        DrawALGO.drawQuadraticBezierCurve(g, 204, 230, 202, 219, 205, 261);
        DrawALGO.drawQuadraticBezierCurve(g, 205, 261, 211, 285, 221, 278);
        DrawALGO.drawQuadraticBezierCurve(g, 221, 278, 211, 285, 245, 270);
        DrawALGO.drawQuadraticBezierCurve(g, 245, 270, 257, 252, 241, 233);
        DrawALGO.drawQuadraticBezierCurve(g, 241, 233, 225, 213, 212, 220);
        DrawALGO.drawQuadraticBezierCurve(g, 212, 220, 200, 230, 204, 230);

        Color c = new Color(136,150,140);
        g.setColor(c);
        DrawALGO.drawQuadraticBezierCurve(g, 218, 256, 211, 256, 210, 265);
        DrawALGO.drawQuadraticBezierCurve(g, 222, 256, 230, 254, 234, 262);
        c = new Color(177,210,158);
        g.setColor(c);
        DrawALGO.my_Bezier_Curve(g,213,271,213, 265,223 , 254 ,232,269);
        g.setColor(Color.BLACK);

        int[] arrx = {218, 221, 223, 222, 219, 217, 217};
        int[] arry = {247, 249, 253, 256, 257, 255, 249};
        DrawALGO.mydrawpoly(g,arrx,arry);

    }

    static void face(Graphics g){
        // โครงหน้า
        DrawALGO.drawQuadraticBezierCurve(g, 134, 321, 100, 308, 100, 295);
        DrawALGO.bresenhamLine(g, 100, 295, 104, 275);
        DrawALGO.drawQuadraticBezierCurve(g, 104, 275, 99, 183, 143, 183);
        DrawALGO.drawQuadraticBezierCurve(g, 143, 183, 146, 159, 157, 159);
        DrawALGO.drawQuadraticBezierCurve(g, 157, 159, 169, 158, 161, 187);
        DrawALGO.drawQuadraticBezierCurve(g, 161, 187, 179, 148, 214, 150);
        DrawALGO.drawQuadraticBezierCurve(g, 214, 150, 220, 169, 207, 187);

        DrawALGO.bresenhamLine(g, 276, 288, 273, 284);
        DrawALGO.drawQuadraticBezierCurve(g, 273, 284, 287, 284, 292 , 272);
        DrawALGO.drawQuadraticBezierCurve(g, 292 , 272, 290, 263, 268 , 270);
        DrawALGO.drawQuadraticBezierCurve(g, 268 , 270, 282, 265, 278 , 255);
        DrawALGO.drawQuadraticBezierCurve(g, 278 , 255, 273, 250, 263 , 256);
        DrawALGO.drawQuadraticBezierCurve(g, 263 , 256, 277, 251, 261 , 217);
        DrawALGO.drawQuadraticBezierCurve(g, 261 , 217, 283, 219, 286 , 195);
        DrawALGO.drawQuadraticBezierCurve(g, 286 , 195, 270, 186, 261 , 198);
        DrawALGO.drawQuadraticBezierCurve(g, 261 , 198, 270, 186, 259 , 179);
        DrawALGO.drawQuadraticBezierCurve(g, 259 , 179, 253, 179, 247 , 197);

        DrawALGO.bresenhamLine(g, 133, 306, 141, 302);
        DrawALGO.bresenhamLine(g, 141, 302, 163, 305);
        DrawALGO.bresenhamLine(g, 163, 305, 196, 301);
        DrawALGO.bresenhamLine(g, 196, 301, 219, 292);
        DrawALGO.bresenhamLine(g, 219, 292, 228, 294);

        DrawALGO.drawQuadraticBezierCurve(g, 102, 263, 99, 258, 94, 258);
        DrawALGO.drawQuadraticBezierCurve(g, 94, 258, 80, 258, 97, 272);
        DrawALGO.drawQuadraticBezierCurve(g, 97, 272, 88, 270, 83, 276);
        DrawALGO.drawQuadraticBezierCurve(g, 83, 276, 83, 286, 94, 287);
        DrawALGO.drawQuadraticBezierCurve(g, 94, 287, 83, 286, 80, 305);
        DrawALGO.drawQuadraticBezierCurve(g, 80, 305, 82, 307, 97, 304);
        DrawALGO.drawQuadraticBezierCurve(g, 97, 304, 97, 313, 108, 308);
        
        Color c = new Color(220,135,150);
        g.setColor(c);
        DrawALGO.drawQuadraticBezierCurve(g, 126, 288, 113, 281, 108, 288);
        DrawALGO.drawQuadraticBezierCurve(g, 108, 288, 104, 294, 118, 296);
        DrawALGO.drawQuadraticBezierCurve(g, 118, 296, 129, 295, 126, 288);
        DrawALGO.bresenhamLine(g, 113, 288, 111, 291);
        DrawALGO.bresenhamLine(g, 120, 289, 119, 293);
       

        DrawALGO.drawQuadraticBezierCurve(g, 235, 282, 238, 268, 252, 274);
        DrawALGO.drawQuadraticBezierCurve(g, 252, 274, 264, 278, 249, 286);
        DrawALGO.drawQuadraticBezierCurve(g, 249, 286, 238, 289, 235, 282);
        DrawALGO.bresenhamLine(g, 239, 282, 241, 278);
        DrawALGO.bresenhamLine(g, 251, 278, 248, 282);

        g.setColor(Color.black);

        int[] arrx = {168, 164, 159, 160, 163, 168};
        int[] arry = {189, 190, 197, 201, 201, 196};
        DrawALGO.mydrawpoly(g,arrx,arry);

        int[] arrx2 = {176, 171, 162, 162, 168, 177, 178};
        int[] arry2 = {199, 199, 209, 215, 216, 208, 202};
        DrawALGO.mydrawpoly(g,arrx2,arry2);
    }

    static void horn(Graphics g){
        //เขา
        DrawALGO.bresenhamLine(g, 261, 182, 295, 134);
        DrawALGO.drawQuadraticBezierCurve(g, 295, 134, 298, 116, 287, 110);
        DrawALGO.drawQuadraticBezierCurve(g, 287, 110, 271 ,109, 254, 124);
        DrawALGO.drawQuadraticBezierCurve(g, 254, 124, 247 ,121, 229, 144);
        DrawALGO.drawQuadraticBezierCurve(g, 232, 150, 232 ,144, 226, 141);
        DrawALGO.drawQuadraticBezierCurve(g, 226, 141, 221 ,146, 215, 163);
        DrawALGO.bresenhamLine(g, 153, 161, 153, 152);
        DrawALGO.bresenhamLine(g, 153, 152, 155, 122);
        DrawALGO.drawQuadraticBezierCurve(g, 155, 122, 151 ,109, 142, 108);
        DrawALGO.drawQuadraticBezierCurve(g, 142, 108, 131 ,111, 123, 129);
        DrawALGO.drawQuadraticBezierCurve(g, 123, 129, 115 ,146, 119, 150);
        DrawALGO.drawQuadraticBezierCurve(g, 119, 150, 123 ,140, 136, 142);
        DrawALGO.drawQuadraticBezierCurve(g, 136, 142, 150 ,144, 153, 152);
        DrawALGO.drawQuadraticBezierCurve(g, 113, 172, 110 ,136, 119, 141);
        DrawALGO.drawQuadraticBezierCurve(g, 112, 200, 93 ,159, 113, 172);
        DrawALGO.drawQuadraticBezierCurve(g, 254, 124, 257 ,129, 245, 140);
        DrawALGO.drawQuadraticBezierCurve(g, 245, 140, 276 ,134, 272, 165);
        DrawALGO.drawQuadraticBezierCurve(g, 125, 126, 144 ,114, 150, 127);
        DrawALGO.drawQuadraticBezierCurve(g, 267, 121, 278, 118, 286 , 134);
    }

    static void arm(Graphics g){
        DrawALGO.bresenhamLine(g, 136, 340, 125, 346);
        DrawALGO.drawQuadraticBezierCurve(g, 125, 346, 111, 345, 100, 354);
        DrawALGO.drawQuadraticBezierCurve(g, 100, 354, 92, 345, 78, 350);
        DrawALGO.drawQuadraticBezierCurve(g, 78, 350, 69, 345, 60, 351);
        DrawALGO.bresenhamLine(g, 60, 351, 74, 363);
        DrawALGO.drawQuadraticBezierCurve(g, 70, 359,76, 357, 78, 350);
        DrawALGO.drawQuadraticBezierCurve(g, 68, 358,62, 374, 71, 372);
        DrawALGO.drawQuadraticBezierCurve(g, 69, 372,71, 384, 84, 383);
        DrawALGO.my_Bezier_Curve(g,84,383,100,414,136,403,140,396);
        DrawALGO.drawQuadraticBezierCurve(g,255,404,273, 442,313,418);
        DrawALGO.my_Bezier_Curve(g,313,418,320,412,322,405,318,402);
        DrawALGO.my_Bezier_Curve(g,311,404,318,405,333,391,304,382);
        DrawALGO.drawQuadraticBezierCurve(g,307,382,300, 369,294,382);
        DrawALGO.drawQuadraticBezierCurve(g,294,382,300, 395,307,382);
        DrawALGO.my_Bezier_Curve(g,284,406,279, 404,272 , 387 ,294,382);

    }
    static void body(Graphics g){
        DrawALGO.my_Bezier_Curve(g, 141, 400, 134, 411, 143, 499, 203, 509);
        DrawALGO.bresenhamLine(g, 203, 509, 282, 508);
        DrawALGO.my_Bezier_Curve(g, 282, 508, 238, 493, 249, 448, 253, 440);
        DrawALGO.drawQuadraticBezierCurve(g,253, 440,256, 431,243,405);
        DrawALGO.drawQuadraticBezierCurve(g,145, 448,155, 463,183,459);
        DrawALGO.drawQuadraticBezierCurve(g,201, 457,225, 456,234,450);
        DrawALGO.drawQuadraticBezierCurve(g,163, 479,180, 488,190,486);
        DrawALGO.drawQuadraticBezierCurve(g,206, 484,236, 487,251,473);
        DrawALGO.drawQuadraticBezierCurve(g,228, 505,254, 503,262,495);
    }
    static void leg(Graphics g){
        DrawALGO.drawQuadraticBezierCurve(g,139, 413,96, 438,113,490);
        DrawALGO.drawQuadraticBezierCurve(g,113, 490,92, 489,90,507);
        DrawALGO.bresenhamLine(g, 90,507, 176, 507);
        DrawALGO.drawQuadraticBezierCurve(g,176, 507,179, 504,176, 497);
        DrawALGO.my_Bezier_Curve(g, 292, 492, 283, 496, 273, 509, 292, 510);
        DrawALGO.bresenhamLine(g, 292, 510, 319, 510);
        DrawALGO.drawQuadraticBezierCurve(g,319, 510,339, 512,340,503);
        DrawALGO.drawQuadraticBezierCurve(g,340,503,345, 500,333,490);
        DrawALGO.my_Bezier_Curve(g,339,495,345, 472 , 330 , 434 ,313,418);
        DrawALGO.drawQuadraticBezierCurve(g,316,416,384, 464,439,463);
        DrawALGO.my_Bezier_Curve(g,439,463,499, 462 , 525 , 415 ,560,434);
        DrawALGO.my_Bezier_Curve(g,340,506,470, 525 , 517 , 433 ,560,434);
        DrawALGO.drawQuadraticBezierCurve(g,339,473,391, 504,437,486);
        DrawALGO.drawQuadraticBezierCurve(g,437,486,440, 491,529,446);
        DrawALGO.drawQuadraticBezierCurve(g,320,500,316, 508,321,510);
        DrawALGO.drawQuadraticBezierCurve(g,305,500,300, 506,305,511);
        DrawALGO.drawQuadraticBezierCurve(g,109,467,119, 471,122,460);
        DrawALGO.drawQuadraticBezierCurve(g,114,477,119, 486,123,477);
        DrawALGO.drawQuadraticBezierCurve(g,289,463,303, 477,313,464);
        DrawALGO.drawQuadraticBezierCurve(g,300,478,314, 494,320,476);
    }
}
