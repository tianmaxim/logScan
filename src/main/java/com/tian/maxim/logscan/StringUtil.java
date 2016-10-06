package com.tian.maxim.logscan;

/**
 * Created by tliu3 on 10/6/16.
 */
public class StringUtil
{
    /**
     * Extract file name (without path and suffix) from file name with path and
     * suffix.
     * <p>
     * For example:
     * <p>
     * <ul>
     * <li>"c:\home\abc.xml" => "abc"
     * <li>"c:\home\abc" => "abc"
     * <li>"/home/user/abc.xml" => "abc"
     * <li>"/home/user/abc" => "abc"
     * </ul>
     *
     * @param filePathName
     *            the file name with path and suffix
     * @return the file name without path and suffix
     */

    public static String extractFileName( String filePathName )
    {
        if ( filePathName == null )
            return null;

        int dotPos = filePathName.lastIndexOf( '.' );
        int slashPos = filePathName.lastIndexOf( '\\' );
        if ( slashPos == -1 )
            slashPos = filePathName.lastIndexOf( '/' );

        if ( dotPos > slashPos )
        {
            return filePathName.substring( slashPos > 0 ? slashPos + 1 : 0,
                    dotPos );
        }

        return filePathName.substring( slashPos > 0 ? slashPos + 1 : 0 );
    }

}
