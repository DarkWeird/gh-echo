# gh-echo

This is a proof-of-concept [extension](https://github.blog/2021-08-24-github-cli-2-0-includes-extensions/) for `gh`, the GitHub CLI tool.
The concept of those extensions is quite simple, `gh` basically acts as plug-in manager and allows to call an exectuable as extension. 
See [Creating GitHub CLI Extensions](https://docs.github.com/en/github-cli/github-cli/creating-github-cli-extensions) for more details.


This is simple micronauts CLI application with PicoCLI with support graalvm's native images.

entry point for gh - bash script `gh-echo` which determinate and handles executable to run.
   * checks architecture and platform.
     * windows-64,linux-64,macos-64 have prebuild binaries at releases. if true - download and use then
   * if your system haven't prebuild binaries - build this project as gradle project 
      * if you have `native-image`(part of graalvm) - build native binary for you platform and use it
      * if you haven't `native-image` - build `shadowjar` - jar with all dependencies and use it
      * if you haven't `javac` - exits with error

> graalvm haven't crosscompile feature. then prebuild binaries provides only for GitHub Action's runners. 

## Getting Started

You can find more information on how to install and use extensions in general under [Using GitHub CLI Extensions](https://docs.github.com/en/github-cli/github-cli/using-github-cli-extensions).
To test this extension, you can easily install it via 

```
gh extension install DarkWeird/gh-echo-example
```

## Usage

As this extensions is a proof-of-concept for testing out the capabilities of `gh` with java.

```
gh echo <anystring>
```

