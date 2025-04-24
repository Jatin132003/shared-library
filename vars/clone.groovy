def call(String GitUrl , String GitBranch){
  echo "Code Clonig"
  git url: "${GitUrl}" , branch: "${GitBranch}"
  echo "Code Clone Successfull"
}
