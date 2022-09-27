package answers;

/*
@author Jackson Splinter

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 */
public class Problem_0832 {
    public static int[][] flipAndInvertImage(int[][] image) 
    {
        int dummy;
        for (int[] image1 : image) 
        {
            int first =0, last=image.length-1;
            while (first<last) 
            {
                dummy = image1[first];
                image1[first] = image1[last];
                image1[last] = dummy;
                first++;
                last--;
            }
            for (int j = 0; j < image1.length; j++) 
            {
                if (image1[j] == 1) 
                {
                    image1[j] = 0;
                } 
                else if (image1[j] == 0) 
                {
                    image1[j] = 1;
                }
            }
        }
        
        return image;
    }
}
