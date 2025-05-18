FROM ubuntu:24.04

# Install required packages
RUN apt-get update && \
    apt-get install -y zsh vim build-essential curl wget git && \
    apt-get clean && rm -rf /var/lib/apt/lists/*

# Install oh-my-zsh (default settings)
RUN sh -c "$(curl -fsSL https://raw.githubusercontent.com/ohmyzsh/ohmyzsh/master/tools/install.sh)" || true

# Set zsh as default shell
RUN chsh -s $(which zsh)

CMD ["zsh"] 