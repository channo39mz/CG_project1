import java.awt.*;

public class bg {
    static void background(Graphics g){
        int[] arrx = {0, 0, 54};
        int[] arry = {82, 185, 98};
        DrawALGO.mydrawpoly(g,arrx,arry);
        arrx = new int[] {0, 54, 98, 72,0};
        arry = new int[] {82 ,98, 60, 0,0};
        DrawALGO.mydrawpoly(g,arrx,arry);
        arrx = new int[] {72,198,242,98};
        arry = new int[] {0,0,68,60};
        DrawALGO.mydrawpoly(g,arrx,arry);
        arrx = new int[] {198,242,341,343};
        arry = new int[] {0,68,68,0};
        DrawALGO.mydrawpoly(g,arrx,arry);
        arrx = new int[] {343,341,471,549,510};
        arry = new int[] {0,68,134,59,0};
        DrawALGO.mydrawpoly(g,arrx,arry);
        DrawALGO.bresenhamLine(g, 471, 134, 600, 189);
        DrawALGO.bresenhamLine(g, 471, 134, 510, 308);
        DrawALGO.bresenhamLine(g, 600, 311, 510, 308);
        DrawALGO.bresenhamLine(g, 510, 308, 483, 363);
        DrawALGO.bresenhamLine(g, 483, 363, 522, 423);
        DrawALGO.bresenhamLine(g, 522, 423, 600, 430);
        DrawALGO.bresenhamLine(g, 569, 426, 538, 486);
        DrawALGO.bresenhamLine(g, 538, 486, 495, 546);
        DrawALGO.bresenhamLine(g, 495, 546, 495, 600);
        DrawALGO.bresenhamLine(g, 495, 546, 285, 543);
        DrawALGO.bresenhamLine(g, 285, 543, 365, 600);
        DrawALGO.bresenhamLine(g, 285, 543, 107, 520);
        DrawALGO.bresenhamLine(g, 107, 520, 63, 600);
        DrawALGO.bresenhamLine(g, 107, 520, 63, 506);
        DrawALGO.bresenhamLine(g, 63, 506, 0, 501);
        DrawALGO.bresenhamLine(g, 63, 506, 80, 424);
        DrawALGO.bresenhamLine(g, 80, 424, 37, 370);
        DrawALGO.bresenhamLine(g, 37, 370, 0, 397);
        DrawALGO.bresenhamLine(g, 37, 370, 45, 315);
        DrawALGO.bresenhamLine(g,45, 315,  0,  291);
    }
}
