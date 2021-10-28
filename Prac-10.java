//Print Words Vertically

class Solution {
    public List<String> printVertically(String s) {
        if(s == null || s.length() == 0) {
            return new ArrayList<>();
        }
        String[] parts = s.split(" ");
        int maxLength = 0;
        
        for(String part : parts) {
            maxLength = Math.max(maxLength, part.length());
        }
        
        List<String> result = new ArrayList<>();
        for(int i = 0 ; i < maxLength; i++) {
            StringBuilder sb = new StringBuilder();
            for(String part : parts) {
                if(i < part.length()) {
                    sb.append(part.charAt(i));
                } else {
                    sb.append(" ");
                }
            }
            result.add(sb.toString().stripTrailing());
        }
        return result;
    }
    
}

//Implement magic dictionary

class MagicDictionary {
    HashSet<String> set;
    public MagicDictionary() {
        set = new HashSet<>();
    }
    
    public void buildDict(String[] dictionary) {
        for(String s : dictionary) {
            set.add(s);
        }
    }
    
    public boolean search(String searchWord) {
        for(String s : set) {
            if(s.length() != searchWord.length()) {
                continue;
            }
            int count = 0;
            for(int i = 0 ; i < searchWord.length(); i++) {
                if(searchWord.charAt(i) != s.charAt(i)) {
                    count++;
                }
            }
            if(count == 1) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */

