package com.company.Day1;
/*
? find the two entries that sum to 2020 and then multiply those two numbers together.
! For example, suppose your expense report contained the following:

!    1721
!    979
!    366
!    299
!    675
!    1456
* In this list, the two entries that sum to 2020 are 1721 and 299. Multiplying them together produces 1721 * 299 = 514579, so the correct answer is 514579.

? Of course, your expense report is much larger. Find the two entries that sum to 2020; what do you get if you multiply them together?
*/

import java.util.Arrays;

public class Report_Repair {
    private static void sum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    int multi = arr[i] * arr[j];
                    System.out.println(multi);
                    int[] index_set = new int[]{i, j};
                    int[] value_set = new int[]{arr[i], arr[j]};
                    System.out.println(Arrays.toString(index_set) + "\n" + Arrays.toString(value_set));
                }
            }
        }
        //! Printing all the values with index
        for (int k = 0; k <= arr.length - 1; k++) {
            System.out.print(" " + k + ":" + arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1531, 1959, 1344, 1508, 1275, 1729, 1904, 1740, 1977, 1992, 1821, 1647, 1404, 1893, 1576, 1509, 1995, 1637, 1816, 1884, 1608, 1943, 1825, 1902, 1227, 1214, 1675, 1650, 1752, 1818, 862, 2006, 227, 1504, 1724, 1961, 1758, 1803, 1991, 1126, 1909, 1643, 1980, 1889, 811, 1699, 1654, 1734, 1770, 1754, 1828, 1811, 1997, 1767, 1854, 1653, 1800, 1762, 1962, 1797, 877, 1660, 1895, 1939, 1679, 1496, 1606, 1262, 1727, 2005, 1796, 1595, 1846, 1822, 1974, 1829, 1347, 1341, 1875, 1726, 1963, 1659, 337, 1826, 1777, 1523, 1979, 1805, 1987, 2009, 1993, 374, 1546, 1706, 1748, 1743, 1725, 281, 1317, 1839, 1683, 1794, 1898, 1824, 1960, 1292, 1876, 1760, 1956, 1701, 1565, 1680, 1932, 1632, 1494, 1630, 1838, 1863, 1328, 1490, 1751, 1707, 1567, 1917, 1318, 1861, 519, 1716, 1891, 1636, 1684, 1200, 1933, 1911, 1809, 1967, 1731, 1921, 1827, 1663, 1720, 1976, 1236, 1986, 1942, 1656, 1733, 1541, 1640, 1518, 1897, 1676, 1307, 1978, 1998, 1674, 1817, 1845, 1658, 1639, 1842, 1929, 1972, 2010, 1951, 858, 1928, 1562, 1787, 1916, 1561, 1694, 1944, 1922, 1882, 1691, 589, 1940, 1624, 1570, 1557, 1791, 1492, 1919, 1615, 1571, 1657, 1984, 1521, 1766, 1790, 1782, 1874, 1198, 1764, 1278, 1688, 1905, 1786, 1281};

        int target = 2020;
        sum(arr, target);
    }
}
