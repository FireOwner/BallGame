package com.example.mateusz.ballgame;

/**
 * Created by Mateusz on 2015-07-11.
 */
public class ObjectFactory {

    public static class BaseObject {

        private int mX;
        private int mY;

        BaseObject(final int pX, final int pY) {
            this.mX = pX;
            this.mY = pY;
        }
    }

    public class LargeObject extends BaseObject {

        LargeObject(final int pX, final int pY) {
            super(pX, pY);
        }
    }

    public class SmallObject extends BaseObject {

        SmallObject(final int pX, final int pY) {
            super(pX, pY);
        }
    }

    public LargeObject createLargeObject(final int pX, final int pY) {

        return new LargeObject(pX, pY);
    }

    public SmallObject createSmallObject(final int pX, final int pY) {

        return new SmallObject(pX, pY);
    }
}
