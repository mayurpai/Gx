import unit
import pytest
import sys


# @pytest.mark.skip(reason="I Don't Wanna Run This")
@pytest.mark.skipif(sys.version_info < (3, 5), reason="Python Version Incompatible")
# custom name 👇
@pytest.mark.windows
def test_calc_square():
    result = unit.calc_square([1, 2, 3, 5])
    assert result == [1, 4, 9, 25]

# test_ rule for methods and file name
# python -m pytest -> Run The Test Files Recursively
# py.test -> Alternate Way
# py.test -v -> (Verbose : PASS/FAIL)
# py.test -v -rxs -> (Reason For Skipping Test)
# py.test -k square -v -> (Run Test Based On Name)
# py.test -k windows -v -> (Run Test Based On Custom Name)
# py.test -m "not windows" -v -> (Run Test Based On Not Of Custom Name)

# print(test_calc_square([1, 2, 3, 5]))
