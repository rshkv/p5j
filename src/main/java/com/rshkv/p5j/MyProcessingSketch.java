package com.rshkv.p5j;

import processing.core.PApplet;

/** 
 * See <a href="https://processing.org/tutorials/eclipse/">https://processing.org/tutorials/eclipse/</a>.
*/
public class MyProcessingSketch extends PApplet {
    Stripe[] stripes = new Stripe[50];

    public static void main(String[] args) {
        PApplet.main("com.rshkv.p5j.MyProcessingSketch");
    }

    public void settings() {
        size(300, 300);
    }

    public void setup() {
        for (int i = 0; i < stripes.length; i++) {
            stripes[i] = new Stripe(this);
        }
    }

    public void draw() {
        background(100);
        for (Stripe stripe : stripes) {
            stripe.move();
            stripe.display();
        }
    }
}