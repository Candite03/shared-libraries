def checkout(Map gitParams) {
    git branch: gitParams.branch, url: gitParams.repoUrl
}
