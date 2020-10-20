class Solution {
    public int lengthOfLongestSubstring(String s) {

            int count=0;
            int size=0;
            List<String>list=new ArrayList<>();
            char[] arr = s.toCharArray();
            String str;
            for(int i=0;i<s.length();i++){
                    str = "";
                    count=0;
                str+=arr[i];
                if(s.length()==1){
                    return 1;
                }
                for(int j=i+1;j<s.length();j++){

                    if(str.contains(Character.toString(s.charAt(j)))){
                        list.add(str);
                        break;

                    } else{
                        str+=arr[j];
                        count++;
                    }
                    if(j==s.length()-1){
                        list.add(str);
                        continue;
                    }

                }
            }
            for(int k=0;k<list.size();k++ ){
                if(list.get(k).length()>size){
                    size=list.get(k).length();
                }
            }
            return size;
        }
        public static void main(String[] args) {
            Solution s = new Solution();
            int length;
            length=s.lengthOfLongestSubstring("abcabcbb");
            System.out.println("Length of longest substring ->"+(Length));
        }
}
