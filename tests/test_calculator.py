import unittest
from calculator import divide

class TestDivision(unittest.TestCase):

    def test_divide_normal(self):
        self.assertAlmostEqual(divide(10, 2), 5.0, places=4, msg="10 / 2 should be 5")
        self.assertAlmostEqual(divide(9, 3), 3.0, places=4, msg="9 / 3 should be 3")

    def test_divide_with_decimals(self):
        self.assertAlmostEqual(divide(5, 2), 2.5, places=4, msg="5 / 2 should be 2.5")
        self.assertAlmostEqual(divide(7, 3), 2.3333, places=4, msg="7 / 3 should be approximately 2.3333")

    def test_divide_by_zero(self):
        with self.assertRaises(ValueError) as context:
            divide(1, 0)
        self.assertEqual(str(context.exception), "Cannot divide by zero")

if __name__ == '__main__':
    unittest.main()
