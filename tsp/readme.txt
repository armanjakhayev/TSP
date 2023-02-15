Programming Assignment: Traveling Salesperson Problem


PLEASE REMEMBER NOT TO INCLUDE YOUR NAME (OR YOUR PARTNER'S NAME)
ANYWHERE IN THIS SUBMISSION.


/**********************************************************************
 * Approximate number of hours to complete this assignment            *
 **********************************************************************/

Number of hours: 30



/**********************************************************************
 *  Explain how you implemented the nearest insertion heuristic.      *
 **********************************************************************/

I tried to find the nearest point to E-point, then changed the tour based on it.

/**********************************************************************
 *  Explain how you implemented the smallest insertion heuristic.     *
 *  It's sufficient to list only the differences between this         *
 *  heuristic and the nearest insertion heuristic.                    *
 **********************************************************************/

I tried to find the smallest delta (difference of the tour), then changed the tour based on it.

/**********************************************************************
 *  First, explain why it is better to use a linked list instead of   *
 *  an array. Second, explain what is the advantage of using a        *
 *  *circularly* linked list instead of a normal linked list.         *
 **********************************************************************/

1.
    1.1. Better, if you don't know how many items you will have.
    1.2. Easier to change.

2. Many more possibilities

/**********************************************************************
 *  In the table below, fill in the lengths that are computed by the  *
 *  two heuristics (nearest neighbor and smallest increase) that we   *
 *  ask you to implement.                                             *
 **********************************************************************/

data file      nearest neighbor     smallest increase
-----------------------------------------------------
tsp10.txt         1566.1363             1655.7462
tsp100.txt        7389.9297             4887.2190
tsp1000.txt       27868.7106            17265.6282
usa13509.txt      77449.9794            45074.7769

/**********************************************************************
 *  Do two timing analyses. Estimate the running time (in seconds)    *
 *  of each heuristic as a function of n, using expressions of the    *
 *  form: a * n^b, where b is an integer.                             *
 *                                                                    *
 *  Explain how you determined each of your answers.                  *
 *                                                                    *
 *  To get your data points, run the two heuristics for n = 1,000,    *
 *  and repeatedly double n until the execution time exceeds 60       *
 *  seconds.                                                          *
 *                                                                    *
 *  You may use TSPTimer to help do this, as per the checklist.       *
 *  If you do so, execute it with the -Xint option. This turns off    *
 *  various compiler optimizations, which helps normalize and         *
 *  stabilize the timing data that you collect.                       *
 *                                                                    *
 *  (If n = 1,000 takes over 60 seconds, your code is too slow.       *
 *  See the checklist for a suggestion on how to fix it.)             *
 **********************************************************************/

n               nearest time           smallest time
------------------------------------------------------------
1000            0.007 seconds           0.01 seconds
2000            0.017 seconds           0.021 seconds
...



/**********************************************************************
 *  If you implemented your own heuristic, please describe here how   *
 *  it differs from the assignments' heuristics, and why you think it *
 *  will perform better.                                              *
 **********************************************************************/

[ if you made a Leaderboard submission, you may copy your answer here ]



/**********************************************************************
 *  If you implemented your own heuristic, please provide the lengths *
 *  of these heuristics for the following two input files.            *
 **********************************************************************/

[ if you made a Leaderboard submission, you may copy your answer here ]

- distance on tsp1000.txt:
- distance on usa13509.txt:



/**********************************************************************
 *  Did you receive help from classmates, past COS 126 students, or
 *  anyone else? If so, please list their names.  ("A Sunday lab TA"
 *  or "Office hours on Thursday" is ok if you don't know their name.)
 **********************************************************************/

Yes or no? Yes, Ardak and Gulnaz helped me with the project.



/**********************************************************************
 *  Did you encounter any serious problems? If so, please describe.
 **********************************************************************/

Yes or no? Yes, with do-while loop.



/**********************************************************************
 *  List any other comments here.
 **********************************************************************/

