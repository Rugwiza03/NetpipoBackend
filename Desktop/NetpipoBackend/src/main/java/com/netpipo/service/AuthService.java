public void register(AuthRequest request, Role role) {
    User user = User.builder()
            .username(request.getUsername())
            .password(passwordEncoder.encode(request.getPassword()))
            .role(role) // Assign role
            .build();

    userRepository.save(user);
}
