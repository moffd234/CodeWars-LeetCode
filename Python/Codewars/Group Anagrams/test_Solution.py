import unittest
from Main import Solution


class testSolution(unittest.TestCase):

    def setUp(self):
        self.subject: Solution = Solution()

    def test_solution_one(self):
        method_input: list[str] = ["act", "pots", "tops", "cat", "stop", "hat"]
        expected: list[list[str]] = [["hat"], ["act", "cat"], ["stop", "pots", "tops"]]
        self.assert_correct(method_input, expected)

    def test_solution_two(self):
        method_input: list[str] = ["x"]
        expected: list[list[str]] = [["x"]]
        self.assert_correct(method_input, expected)

    def test_solution_three(self):
        method_input: list[str] = [""]
        expected: list[list[str]] = [[""]]
        self.assert_correct(method_input, expected)

    def assert_correct(self, method_input: list[str], expected: list[list[str]]) -> None:
        actual: list[list[str]] = self.subject.groupAnagrams(method_input)
        self.assertEqual(actual, expected)
