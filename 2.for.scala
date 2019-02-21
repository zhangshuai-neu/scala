object Test {
    def main(args: Array[String]) {
        var a = 0;
        var b = 0;
        // 循环区间 =================
        println("循环区间");
        for( a <- 1 to 2; b <- 1 to 2){
            println( "Value of a: " + a );
            println( "Value of b: " + b );
        }
        // 循环集合 =================
        println("循环集合");
        val numList = List(1,2,3,4,5,6);
        for( a <- numList ){
           println( "Value of a: " + a );
        }
        // 循环过滤 =================
        println("循环过滤");
        for(a <- numList
            if a != 3; 
            if a < 5) {
            println( "Value of a: " + a );
        }
        // 使用yield =================
        println("使用yield");
        var retVal = for{a <- numList 
                         if a != 3; 
                         if a < 5} yield a
        for( a <- retVal) {
            println( "Value of a: " + a );
        }
    }
}
