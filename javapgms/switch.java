class Sample{
	public static void main(String args[]){
	String item = 'Flower';
	String flower = 'Rose';

	switch(item){
	case 'fruits':System.out.println('it is fruit');
	  break;
	case 'Flower':switch(flower)
	                 {
	                   case 'jasmine': System.out.println('jasmine is here');
	                       break;
	                   case 'Rose': System.out.println('it is Rose');
	                       break;
	                    default:System.out.println('flower is not found');
                     }
                     break;
    default:System.out.println('item is not found');                 

	}

	}
}