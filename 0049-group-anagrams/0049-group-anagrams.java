class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<HashMap<Character,Integer>,ArrayList<String>> res=new HashMap<>();
       for(String str:strs)
       {   HashMap<Character,Integer> hm=new HashMap<>();
           for(int i=0;i<str.length();i++)
           {
               hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
           }
          if(res.containsKey(hm))
          {
              ArrayList<String> res1=res.get(hm);
              res1.add(str);
          }
          else
          {
              ArrayList<String> res1=new ArrayList<>();
              res1.add(str);
              res.put(hm,res1);
          }
       }
       List<List<String>> finalres=new ArrayList<>();
       for(ArrayList<String> res1:res.values())
       {
           finalres.add(res1);
       }
        return finalres;
    }
}