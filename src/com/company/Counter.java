package com.company;

public class Counter {

        int position,step;

        Counter(int p , int s){
            this.position =p ;
            this.step = s ;
        }

        Counter(int p){
            this(p ,1);
        }
        Counter(){
            this(0,1);
        };

        public void init(int initPos , int s){
            position = initPos;
            step = s ;
        }

        public void count (){
            position+=step;
        }

        public int getPosition(){
            return position;
        }

        public void inc(){
            this.position++;
        }

        public String ToString(){
            return String.valueOf(getPosition());
        }

        void count2(){
            int position = this.position;
            position+=step;
            this.position = position;
        }

}
