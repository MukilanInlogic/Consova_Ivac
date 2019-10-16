package commonpage.util;

import commonpage.toolbox.Sync;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class FileUtil {

    static Logger log = LogManager.getLogger(FileUtil.class.getName());
    public static String strLastexportedFileName="";

    /**
     * Description:This method is used to create a new directory if no such directory exists
     * @param strPath
     * @return isDirectory
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean createDirectoryiIfNotExists(String strPath) {
        boolean isDirectory = false;
        try{
            File DownloadDirectory = new File(strPath);
            if (!DownloadDirectory.exists()) {
                isDirectory = DownloadDirectory.mkdir();
            }
        } catch (Exception ex) {
            log.error("createDirectoryiIfNotExists"+ex);
            isDirectory=false;
        }
        return isDirectory;
    }


    /**
     * Description:This method is used to rename an existing file
     * @param strold,strNew
     * @return isDirectory
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean renameFile(String strold, String strNew) {
        boolean isDirectory = false;
        try{
            File oldName = new File(strold);
            File newName = new File(strNew);
            if (oldName.renameTo(newName)) {
                isDirectory = true;
            } else {
                isDirectory = false;
            }
        } catch (Exception ex) {
            log.error("renameFile"+ex);
            isDirectory=false;
        }
        return isDirectory;
    }

    /**
     * Description:This method is used to delete all files in the specified path
     * @param strDirectoryPath
     * @return isDirectoryPath
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean deleteFiles(String strDirectoryPath) {
        boolean isDirectoryPath = false;
        try{
            File f = new File(strDirectoryPath);
            f.mkdir();
            if (f.isDirectory()) {
                String fileList[] = f.list();
                int num = fileList.length;
                for (int i = 0; i < num; i++) {
                    File f1 = new File(f.getAbsolutePath() + "\\" + fileList[i]);
                    isDirectoryPath = f1.delete();
                }
                f.mkdir();
            }
        } catch (Exception ex) {
            log.error("deleteFiles"+ex);
            isDirectoryPath=false;
        }
        return isDirectoryPath;
    }

    /**
     * Description:This method is used to get whole PDF file data in a string using PDFParser and check with expected string value matches with the PDF String
     * @param strFileLocation
     * @return concatenatedData
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String PDFGetData(String strFileLocation) {
        PDFTextStripper pdfStripper = null;
        PDDocument pdDoc = null;
        COSDocument cosDoc = null;
        String strData = null;
        String concatenatedData = null;
        String strReplacedFileLocation = strFileLocation.replace('\\', '/');
        System.out.println("The replaced String is final string is>>" + strReplacedFileLocation);
        File file = new File(strReplacedFileLocation);
        try {
            PDFParser parser = new PDFParser(new RandomAccessFile(file, "r"));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            pdfStripper.setStartPage(0);
            pdfStripper.setEndPage(4);
            strData = pdfStripper.getText(pdDoc);
            System.out.println(strData);
            concatenatedData = strData.replaceAll("[\r\n]+", " ").replaceAll(" ", "");
        } catch (IOException e) {
            log.error("PDFGetData"+e);
        }
        return concatenatedData;
    }

    /**
     * Description:This method is used to get all file names from specified folder
     * @param strFolderLocation
     * @return strFileName
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static StringBuilder getFileNamesFromFolder(String strFolderLocation) {
        StringBuilder strFileName = new StringBuilder();
        try {
            File folder = new File(strFolderLocation);
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    strFileName.append(file.getName());
                }
            }
        } catch (Exception e) {
            log.error("getFileNamesFromFolder"+e);
        }
        return strFileName;
    }

    /*
     * @Description: Closing Word/Excel/PPT/Access application by killing task at runtime
     * @param strApplicationName
     * @return isClosed
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean closeFile(String strApplicationName) {
        boolean isClosed = false;
        try {
            Runtime.getRuntime().exec("taskkill /f /im " + strApplicationName);
            isClosed = true;
        } catch (IOException e) {
            isClosed = false;
            log.error("closeFile"+e);
        }
        return isClosed;
    }

    /*
     * @Description: To open MS Application by passing folder path and folder name
     * @param strFolderPath,strFileName
     * @return isOpened
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean openFile(String strFolderPath, String strFileName) throws IOException {
        boolean isOpened = false;
        try {
            if (Desktop.isDesktopSupported()) {
                File projectFile = new File(new StringBuilder(strFolderPath).append(strFileName).toString());
                int inCount = 0;
                do {
                    Sync.waitForSeconds(10);
                    inCount++;
                } while (projectFile.exists() == false && inCount <= 10);

                Desktop.getDesktop().open(projectFile);
                isOpened = true;
            }
        } catch (IOException e) {
            isOpened = false;
            log.error("openFile"+e);
        }

        return isOpened;
    }

    /**
     * Description:This method is to find the Last Downloaded File with specified extension in Downloads folder
     * @param DefaultDownloads,fileName
     * @return downloadedFile
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean checkDownloadedFileName(String DefaultDownloads, String fileName) {
        boolean downloadedFile = false;

        System.out.println("fileName is " + fileName);
        String[] arrOfStr = fileName.split(Pattern.quote("."));
        String Filename = arrOfStr[0];
        System.out.println("Filename " + Filename);
        String FilenameExt = arrOfStr[1];
        System.out.println("FilenameExt " + FilenameExt);

        try {
            File dirPath = new File(DefaultDownloads);
            File[] files = dirPath.listFiles();
            System.out.println("dirPath " + dirPath);
            for(File file : files){
                System.out.println("Deleting "+file.getName());
                if (file.getName().contains(".csv")) {
                    System.out.println("If Name with extension");
                    System.out.println(file.getName());
                    if (file.getName().contains(Filename)) {
                        System.out.println("If Name contains Filename " + file.getName());
                        strLastexportedFileName = file.getName();
                        System.out.println("Matched File Name " + strLastexportedFileName);
                        downloadedFile = true;
                        break;
                    }
                }
            }


        } catch (Exception ex) {
            log.error("checkDownloadedFileName_1"+ex);
        }
        System.out.println("Atlast checkDownloadedFileName");
        System.out.println("checkDownloadedFileName bool value is " + downloadedFile);
        return downloadedFile;
    }



    /**
      * Description:This method is to delete files with specified name and specified file Extension in Downloads folder
     * before downloading a new file
     * @param fileName,fileFolderPath
     * @return deletedFile
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean deleteFilesBasedonExtension(String fileName,String fileFolderPath) {
        boolean deletedFile = false;
        System.out.println("fileName is " + fileName);
        String[] arrOfStr = fileName.split(Pattern.quote("."));
        String Filename = arrOfStr[0];
        System.out.println("Filename " + Filename);
        String FilenameExt = arrOfStr[1];
        System.out.println("FilenameExt " + FilenameExt);

        try {
        File dirPath = new File(fileFolderPath);
        File[] files = dirPath.listFiles();
        System.out.println("dirPath " + dirPath);
            if (files == null) {
                deletedFile = true;
                System.out.println("length is 0");
            } else {
                System.out.println("Inside else");
               for(File file : files) {
            System.out.println("Deleting " + file.getName());
            if (file.getName().trim().contains(Filename.trim())) {
                file.delete();
                System.out.println("deleting file with specific filename");
            }
            deletedFile = true;
          }
        }

        } catch (Exception ex) {
            log.error(ex);
            System.out.println("deleteFilesBasedonExtension" + ex.getMessage());
        }
        System.out.println("deleteFilesBasedonExtension bool value is "+deletedFile);
        return deletedFile;
    }

}
