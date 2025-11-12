package twosum;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BruteForceApproachTest {

    @Test
    @DisplayName("Test should return 0 and 1 index when match")
    void test_should_return_first_0_and_1_index_when_match() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = new BruteForceApproach().twoSum(nums, target);
        assert(actual[0] == expected[0] && actual[1] == expected[1]);
    }

    @Test
    @DisplayName("Test should return 1 and 2 index when match")
    void test_should_return_first_1_and_2_index_when_match() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expected = {1,2};
        int[] actual  = new BruteForceApproach().twoSum(nums, target);
        assert actual[0] == expected[0] && actual[1] == expected[1];
    }

    @Test
    @DisplayName("Test should return empty array when no  match")
    void test_should_return_empty_array_when_no_match() {
        int[] nums = {3,2,4};
        int target = 10;
        int[] expected = {};
        int[] actual  = new BruteForceApproach().twoSum(nums, target);
        assert actual.length == 0;
    }

    @Test
    @DisplayName("Test should return 0 and 3 index when match with negative numbers")
    void test_should_return_0_and_3_index_when_match_with_negative_numbers() {
        int [] nums ={-3,-2,4,6};
        int target = 3;
        int [] expected = {0,3};
        int[] actual = new BruteForceApproach().twoSum(nums, target);
        assert actual[0] == expected[0] && actual[1] == expected[1];
    }
    @Test
    @DisplayName("Test should return 0 and 1 index when match with negative numbers and sum is negative")
    void test_should_return_0_and_1_index_when_match_with_negative_numbers_and_sum_is_negative(){
        int [] nums = {-2,-3,-4};
        int target = -5;
        int [] expected = {0,1};
        int[] actual = new BruteForceApproach().twoSum(nums, target);
        assert actual[0] == expected[0] && actual[1] == expected[1];
    }

}