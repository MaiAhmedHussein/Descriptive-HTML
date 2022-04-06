# Descriptive-HTML

## Building a language that is parsed to HTML

The grammer of the language:

*create → "ADD" element

*element → img | header | para | url

*img → "IMAGE" "WITH" "SOURCE" quote sentence quote

*header → "HEADING" decorated_text

*para → "PARAGRAPH" decorated_text

*url → "LINK" decorated_url

*decorated_text → decorated_text "AND" decorated_text | text | color | font

*text → "WITH" "TEXT" quote sentence quote

*color → "WITH" "COLOR" quote sentence quote

*font → "WITH" "FONT" quote sentence quote

*sentence → sentence alphanumeric | 𝛆

*quote → "“"

*alphanumeric → "0"-"9" | "a"-"z" | "A"-"Z" | "/" | ":" | "."


## Example: 
ADD IMAGE WITH SOURCE "http://photos.wikimapia.org/p/00/00/78/91/00_big.jpg"
ADDHEADING WITH TEXT "Faculty of Engineering"
ADD PARAGRAPH WITH TEXT "Welcome to Our College!!" AND WITH FONT "Helvetica" AND WITH COLOR "Magenta"
ADD LINK WITH TEXT "Ibn EL Haitham" AND WITH LINK "https://alexu.mans.edu.eg/static/index.html" WITH FONT "Arial" AND WITH COLOR "Red"
EXIT

## OutPut:

![image](https://user-images.githubusercontent.com/77025553/161997543-334cfeb0-9c38-4175-bafd-cc100a9b846d.png)
