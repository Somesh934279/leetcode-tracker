// Last updated: 7/9/2026, 9:47:22 AM
class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> sourceCities = new HashSet<>();
        for (List<String> path : paths) {
            sourceCities.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!sourceCities.contains(path.get(1))) {
                return path.get(1);
            }
        }
        
        return "";
    }
}