def call(Map gitParams) {
    git branch: gitParams.branch, url: gitParams.repoUrl
}

def validate(Map gitParams) {
    if (!gitParams.repoUrl) {
        error 'repoUrl is required'
    }
}
