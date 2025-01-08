class Solution {
    public int prefixCount(String[] words, String pref) {
      if(words.length==0){
        return 0;
      }
      int count=0;
      for(int i=0;i<words.length;i++){
        if(words[i].startsWith(pref)){
            count++;
        }
      }  
      return count;
    }
}