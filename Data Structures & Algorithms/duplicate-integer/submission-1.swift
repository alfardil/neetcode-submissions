class Solution {
    func hasDuplicate(_ nums: [Int]) -> Bool {
        var set = Set<Int>()
        for num in nums {
            if !set.insert(num).inserted {
                return true
            }
        }
        return false
    }
}
