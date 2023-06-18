class Solution {
    public boolean isValid(String s) {
        int length = s.length();
			char nextChar = ' ';
			Stack<Character> stack1 = new Stack<>();

			for (int index = 0; index < length; index++)
			{
				nextChar = s.charAt(index);
				
				if(nextChar == '(' || nextChar == '{' || nextChar =='[')
				{
					stack1.push(nextChar);
				}
				else if(nextChar == ')' || nextChar == '}' || nextChar ==']')
				{
					if(stack1.isEmpty())
					{
						return false;
					}
					
					if(!isPair(stack1.pop(), nextChar))
					{
						return false;
					}
				}	
			}
			if(!stack1.isEmpty())
			{
				return false;
			}
			return true;
        
    }
		public static boolean isPair(char open, char close)
		{
			return (open =='(' && close ==')') || (open=='{' && close=='}') || (open =='['&& close==']'); 
		
	}
}