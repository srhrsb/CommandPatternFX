package com.brh.commandpatternfx;

public class Invoker {

       public String invoke( Command cmd){
          return cmd.execute();
       }

}
